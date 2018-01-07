package prbrios.cfepdf;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.qrcode.EncodeHintType;
import com.itextpdf.text.pdf.qrcode.ErrorCorrectionLevel;
import com.itextpdf.tool.xml.NoCustomContextException;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.html.Span;
import com.itextpdf.tool.xml.html.TagProcessorFactory;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.ctx.MapContext;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

public class CFEPDFGeradorPdf {

	public void criarPdf(String codigohtml, String output) throws UnsupportedEncodingException, IOException, DocumentException {

		Rectangle pagesize = new Rectangle(200, 2000);
		Document document = new Document(pagesize, 0, 0, 0, 0);
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(output));
		document.open();
		CSSResolver cssResolver = XMLWorkerHelper.getInstance().getDefaultCssResolver(false);

		// HTML
		HtmlPipelineContext htmlContext = new HtmlPipelineContext(null);
		TagProcessorFactory factory = Tags.getHtmlTagProcessorFactory();
		
		factory.addProcessor(new Span() {
			@Override
			public List<Element> end(WorkerContext ctx, Tag tag, List<Element> l) {
				List<Element> list = new ArrayList<Element>(1);
				list.add(getEanBarcodeChunk(ctx, tag.getAttributes()));
				return list;
			}
		}, "barcode");
		
		factory.addProcessor(new Span() {
			@Override
			public List<Element> end(WorkerContext ctx, Tag tag, List<Element> l) {
				List<Element> list = new ArrayList<Element>(1);
				list.add(getQrCodeChunk(ctx, tag.getAttributes()));
				return list;
			}
		}, "qrcode");
		
		htmlContext.setTagFactory(factory);
		htmlContext.autoBookmark(false);

		// Pipelines
		PdfWriterPipeline pdf = new PdfWriterPipeline(document, writer);
		HtmlPipeline html = new HtmlPipeline(htmlContext, pdf);
		CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);

		// XML Worker
		XMLWorker worker = new XMLWorker(css, true);
		XMLParser p = new XMLParser(worker);
		p.parse(new ByteArrayInputStream(codigohtml.getBytes(StandardCharsets.UTF_8.name())));
		//p.parse(new FileInputStream(HTML));

		document.close();
	}
	
	public Chunk getEanBarcodeChunk(WorkerContext ctx, Map<String, String> attributes) {
		
		MapContext mc;
		try {
			mc = (MapContext) ctx.get("com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline");
		} catch (NoCustomContextException ex) {
			throw new ExceptionConverter(ex);
		}
		PdfWriter writer = (PdfWriter) mc.get("WRITER");
		String type = attributes.get("type");
		Image img = null;

		if ("EAN8".equals(type)) {
			Barcode barcode = new BarcodeEAN();
			barcode.setCodeType(BarcodeEAN.EAN8);
			barcode.setCode(attributes.get("value"));
			img = barcode.createImageWithBarcode(writer.getDirectContent(), null, null);
		}else if ("EAN13".equals(type)) {
			Barcode barcode = new BarcodeEAN();
			barcode.setCodeType(BarcodeEAN.EAN13);
			barcode.setCode(attributes.get("value"));
			img = barcode.createImageWithBarcode(writer.getDirectContent(), null, null);
		}else if ("CODE128_UCC".equals(type)) {
			Barcode128 barcode = new Barcode128();
			barcode.setCodeType(Barcode.CODE128_UCC);
			barcode.setFont(null);
			barcode.setCode(attributes.get("value"));
			img = barcode.createImageWithBarcode(writer.getDirectContent(), null, null);
		}
		return new Chunk(img, 0, 0, true);
	}
	
	public Chunk getQrCodeChunk(WorkerContext ctx, Map<String, String> attributes) {

		@SuppressWarnings("unused")
		String type = attributes.get("type");

		Image img = null;
		Map<EncodeHintType,Object> hints = new HashMap<EncodeHintType, Object>();
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		
		BarcodeQRCode barcodeQRCode = new BarcodeQRCode(attributes.get("value"), 1, 1, hints);
		//barcodeQRCode.getBarcodeSize().setBorderWidthBottom(0f);
		//barcodeQRCode.getBarcodeSize().setBorderWidthTop(0f);
		try {
			img = barcodeQRCode.getImage();
			img.setSpacingAfter(0);
			img.setSpacingBefore(0);
			img.setWidthPercentage(125f);
		} catch (BadElementException e) {
			e.printStackTrace();
		}
		
		return new Chunk(img, 0, 0, true);
	}

}
