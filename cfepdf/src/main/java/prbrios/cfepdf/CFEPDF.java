package prbrios.cfepdf;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import prbrios.cfepdf.esquema.cfe.CFe;
import prbrios.cfepdf.esquema.cfecanc.CFeCanc;

public class CFEPDF {

	private String saida;
	private CFEPDFRetornoEnvioDadosVenda dadosRetorno;
	
	CFEPDF(String retornoSAT, String saida) throws CFEPDFException{
		this.saida = saida;
		this.dadosRetorno = new CFEPDFRetornoEnvioDadosVenda(retornoSAT);
	}
	
	private String getXml() {
		return new String(Base64.getMimeDecoder().decode(this.dadosRetorno.getXmlBase64()));
	}

	private String defineDiretorioArquivo(String prefixo, String diretorioOutput) {

		if(diretorioOutput == null)
			diretorioOutput = System.getProperty("java.io.tmpdir");
		else
			if(!new File(diretorioOutput).isDirectory())
				diretorioOutput = System.getProperty("java.io.tmpdir");
		
		Path path = Paths.get(diretorioOutput, (prefixo == null ? "" : prefixo) + System.currentTimeMillis() + ".pdf");
		this.saida = path.toString();
		return path.toString();
	}
	
	private String dadosQRCode() {
		return String.format("%1$s|%2$s|%3$s|%4$s|%5$s", this.dadosRetorno.getChaveConsulta(), this.dadosRetorno.getDataHoraEmissao(), this.dadosRetorno.getValorTotal(), this.dadosRetorno.getCpfCnpjAdquirente(), this.dadosRetorno.getAssinaturaQRCode());
	}
	
	public void gerarPdfAutorizacao() throws CFEPDFException {
		try {
			this.saida = this.defineDiretorioArquivo("AUT", this.saida);
			
			CFe cfe = new CFEPDFEsquemas().objetoCFe(this.getXml());
			String html = new CFEPDFGeradorHtml(cfe, this.dadosQRCode()).toString();
			CFEPDFGeradorPdf g = new CFEPDFGeradorPdf();
			g.criarPdf(html, this.saida);
			
		}catch(Exception e) {
			throw new CFEPDFException(e.getMessage());
		}
	}
	
	public void gerarPdfCancelamento() throws CFEPDFException {
		try {
			this.saida = this.defineDiretorioArquivo("AUT", this.saida);
			CFeCanc cfeCanc = new CFEPDFEsquemas().objetoCFeCanc(this.getXml());
			String html = new CFEPDFGeradorHtml(cfeCanc, this.dadosQRCode()).toString();
			CFEPDFGeradorPdf g = new CFEPDFGeradorPdf();
			g.criarPdf(html, this.saida);
		}catch(Exception e) {
			throw new CFEPDFException(e.getMessage());
		}
	}
	
	public String getSaida() {
		return saida;
	}
	
}
