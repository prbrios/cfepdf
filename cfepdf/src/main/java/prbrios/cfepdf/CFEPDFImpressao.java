package prbrios.cfepdf;

import java.awt.print.PrinterJob;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class CFEPDFImpressao {

	public void imprimir(String arquivo) throws CFEPDFException {
		
		if(!this.isPdf(arquivo))
			throw new CFEPDFException("Formato do arquivo \u00e9 inválido.");
		
		try {
    		PDDocument documento = PDDocument.load(new File(arquivo));
    		PrintService servico = PrintServiceLookup.lookupDefaultPrintService();
    		PrinterJob job = PrinterJob.getPrinterJob();
    		job.setPageable(new PDFPageable(documento));
    		job.setPrintService(servico);
    		job.print();
    		documento.close();
    	}catch(Exception e) {
    		throw new CFEPDFException("Ocorreu um erro ao relizar a impress\u00e3o. " + e.getMessage());
    	}
	}
	
	private boolean isPdf(String arquivo) throws CFEPDFException {
		try {
			return new File(arquivo).getName().endsWith(".pdf");
		}catch(Exception e) {
			throw new CFEPDFException(e.getMessage());
		}
	}
	
	public void imprimirAvulso(String texto, String css) throws CFEPDFException {
		try {
			Path path = Paths.get(System.getProperty("java.io.tmpdir"), System.currentTimeMillis() + ".pdf");
			String html = new CFEPDFGeradorHtml().gerarHtmlDeTexto(texto, css);
			CFEPDFGeradorPdf pdf = new CFEPDFGeradorPdf();
			pdf.criarPdf(html, path.toString());
			this.imprimir(path.toString());
		}catch(Exception e) {
			throw new CFEPDFException(e.getMessage());
		}
	}
	
}
