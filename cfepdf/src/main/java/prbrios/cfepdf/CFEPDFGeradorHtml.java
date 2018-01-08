package prbrios.cfepdf;

import prbrios.cfepdf.esquema.cfe.CFe;
import prbrios.cfepdf.esquema.cfe.Det;
import prbrios.cfepdf.esquema.cfe.MP;
import prbrios.cfepdf.esquema.cfecanc.CFeCanc;

public class CFEPDFGeradorHtml {

	private StringBuilder html;
	private String qrcode = null;
	
	private String css() {
		StringBuilder sb = new StringBuilder();
		sb.append("table{width: 200pt;}");
		sb.append("table tr td{padding:2px;font-family:Arial;font-size:10px;}");
		sb.append(".cabecalho{font-weight:normal;text-align:center;}");
		sb.append(".sep{border-bottom: solid 1px black;}");
		sb.append(".sep-top{border-top: solid 1px black;}");
		sb.append(".extrato{font-weight:bold;text-align:center;}");
		sb.append(".monospace{font-family: courier;}");
		sb.append(".itens{font-weight:bold;}");
		sb.append(".total{font-weight:bold;font-size:12px;}");
		sb.append(".chave{font-size:9px;text-align: center;}");
		sb.append(".direita{text-align:right}");
		sb.append(".100pt{width:100pt;}");
		sb.append(".200pt{width:200pt;}");
		return sb.toString();
	}
	
	private String cabecalho(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"cabecalho 200pt sep\">");
		sb.append(cfe.getInfCFe().getEmit().getxNome() + "<br/>");
		sb.append(cfe.getInfCFe().getEmit().getEnderEmit().getxLgr() + "<br/>");
		sb.append("CNPJ: " + cfe.getInfCFe().getEmit().getCnpj() + " IE: " + cfe.getInfCFe().getEmit().getIe());
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String extrato(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"extrato 200pt sep\">");
		sb.append("Extrato N&#176; " + cfe.getInfCFe().getIde().getnCFe() + "<br/>");
		sb.append("CUPOM FISCAL ELETR&Ocirc;NICO - SAT");
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String consumidor(CFe cfe) {
		
		String dadosConsumidor = "N&atilde;o informado";
		if(cfe.getInfCFe().getDest() != null) {
			if(cfe.getInfCFe().getDest().getCpf() != null)
				dadosConsumidor = cfe.getInfCFe().getDest().getCpf();
			else if(cfe.getInfCFe().getDest().getCnpj() != null)
				dadosConsumidor = cfe.getInfCFe().getDest().getCnpj();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"200pt sep\">");
		sb.append("CPF/CNPJ do CONSUMIDOR: " + dadosConsumidor);
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String itens(CFe cfe) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"itens monospace 200pt\">");
		sb.append("#   COD        DESCRI&Ccedil;&Atilde;O<br/>");
		sb.append("QTD  UND &times; Vl Uni R&#36; (Vl Tr R&#36;) Vl It R&#36;<br/>");
		sb.append("-------------------------------------------<br/>");
		
		for(Det det : cfe.getInfCFe().getDet()) {
			
			String nItem = String.format("%-4s", String.format("%03d", Integer.parseInt(det.getnItem().toString())));
        	String xProd = String.format("%-100s", det.getProd().getxProd()).substring(0,40).trim();
        	String cProd = String.format("%-100s", det.getProd().getcProd()).substring(0,11);
        	String qCom = det.getProd().getqCom().replace(".", ",");
        	String uCom = det.getProd().getuCom();
        	String vUnCom = det.getProd().getvUnCom().replace(".", ",");
        	String vItem12741 = det.getImposto().getvItem12741() == null ? "(0,00)" : det.getImposto().getvItem12741().replace(".", ",");
        	String vProd = det.getProd().getvProd().replace(".", ",");
        	
        	sb.append(String.format("%1$s %2$s %3$s", nItem, cProd, xProd) + "<br/>");
        	sb.append(String.format("%1$s %2$s &times; %3$s (%4$s) %5$s", qCom, uCom, vUnCom, vItem12741, vProd));
        	sb.append("<br/>");
		}
		
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String total(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td class=\"total 100pt\">");
		sb.append("VALOR TOTAL R&#36;");
		sb.append("</td>");
		sb.append("<td class=\"total direita 100pt\">");
		sb.append(cfe.getInfCFe().getTotal().getvCFe().replace(".", ","));
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String pagamento(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		for(MP mp : cfe.getInfCFe().getPgto().getMp()) {
			String meioPagamento = "Outros";
			
			if(mp.getcMP().equals("01")) {
	    		meioPagamento = "Dinheiro";
	    	}else if(mp.getcMP().equals("02")) {
	    		meioPagamento = "Cheque";
	    	}else if(mp.getcMP().equals("03") || mp.getcMP().equals("04")) {
	    		meioPagamento = "Cart&atilde;o";
	    	}
			
			sb.append("<tr>");
			sb.append("<td>");
			sb.append(meioPagamento);
			sb.append("</td>");
			sb.append("<td class=\"direita\">");
			sb.append(mp.getvMP().replace(".", ","));
			sb.append("</td>");
			sb.append("</tr>");
		}
		return sb.toString();
	}
	
	private String observacoes(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"sep sep-top 200pt\">");
		sb.append("OBSERVA&Ccedil;&Ocirc;ES DO CONTRIBUINTE<br/>");
		sb.append("Valor aproximado dos tributos conforme Lei Federal 12.741/2012 R&#36; " + cfe.getInfCFe().getTotal().getvCFeLei12741().replace(".", ",") + "<br/>");
		sb.append(cfe.getInfCFe().getInfAdic().getInfCpl());
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String autorizacao(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"extrato 200pt\">");
		sb.append("SAT N&#176; " + cfe.getInfCFe().getIde().getNserieSAT() + "<br/>");
		sb.append(this.formataData(cfe.getInfCFe().getIde().getdEmi()) + " " + this.formataHora(cfe.getInfCFe().getIde().gethEmi()));
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}
	
	private String chave(CFe cfe) {
		String chave = cfe.getInfCFe().getId().substring(3);
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"chave 200pt\">");
		sb.append(chave);
		sb.append("</td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"chave 200pt\">");
		sb.append("<barcode type=\"CODE128_UCC\" value=\"" + chave.substring(0, 22) + "\"/>");
		sb.append("</td>");
		sb.append("</tr>");		
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"chave 200pt\">");
		sb.append("<barcode type=\"CODE128_UCC\" value=\"" + chave.substring(22) + "\"/>");
		sb.append("</td>");
		sb.append("</tr>");
		
		return sb.toString();
	}
	
	private String qrcode(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		if(this.qrcode != null) {
			sb.append("<tr>");
			sb.append("<td colspan=\"2\" align=\"center\" class=\"200pt\">");
			sb.append("<qrcode value=\"" + this.qrcode + "\"/>");
			sb.append("</td>");
			sb.append("</tr>");
		}
		return sb.toString();
	}
	
	private String formataData(String dEmi) {
		String dia = dEmi.substring(0, 4);
		String mes = dEmi.substring(4, 6);
		String ano = dEmi.substring(6, 8);
		return String.format("%1$s/%2$s/%3$s", dia, mes, ano);
	}
	
	private String formataHora(String hEmi) {
		String h = hEmi.substring(0, 2);
		String m = hEmi.substring(2, 4);
		String s = hEmi.substring(4, 6);
		return String.format("%1$s:%2$s:%3$s", h, m, s);
	}
	
	CFEPDFGeradorHtml(CFe cfe, String qrcode){
		this.qrcode = qrcode;
		
		this.html = new StringBuilder();
		this.html.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">");
		this.html.append("<head>");
		this.html.append("<title>.</title>");
		this.html.append("<meta charset=\"utf-8\"/>");
		this.html.append("<style type=\"text/css\">");
		this.html.append(this.css());
		this.html.append("</style>");
		this.html.append("</head>");
		this.html.append("<body>");
		this.html.append("<table>");
		this.html.append(this.cabecalho(cfe));
		this.html.append(this.extrato(cfe));
		this.html.append(this.consumidor(cfe));
		this.html.append(this.itens(cfe));
		this.html.append(this.total(cfe));
		this.html.append(this.pagamento(cfe));
		this.html.append(this.observacoes(cfe));
		this.html.append(this.autorizacao(cfe));
		this.html.append(this.chave(cfe));
		this.html.append(this.qrcode(cfe));
		this.html.append("</table>");
		this.html.append("</body>");
		this.html.append("</html>");
	}
	
	CFEPDFGeradorHtml(CFeCanc cfeCanc, String qrcode){
		
	}

	CFEPDFGeradorHtml(){
		
	}
	
	/**
	 * Converte um texto em html
	 * @param texto
	 * @return
	 */
	public String gerarHtmlDeTexto(String texto, String css) {
		StringBuilder sb = new StringBuilder();
		sb.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">");
		sb.append("<head>");
		sb.append("<title>.</title>");
		sb.append("<meta charset=\"utf-8\"/>");
		sb.append("<style type=\"text/css\">");
		sb.append("table {width:200pt;}");
		sb.append(".sss{" + css + "}");
		sb.append(".200pt{width:200pt;}");
		sb.append("</style>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<td class=\"sss 200pt\">");
		sb.append(texto);
		sb.append("</td>");
		sb.append("</tr>");
		sb.append("</table>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return this.html.toString();
	}
	
}
