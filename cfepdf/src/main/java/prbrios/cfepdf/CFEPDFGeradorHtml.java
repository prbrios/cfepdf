package prbrios.cfepdf;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

import prbrios.cfepdf.esquema.cfe.CFe;
import prbrios.cfepdf.esquema.cfe.Det;
import prbrios.cfepdf.esquema.cfe.MP;
import prbrios.cfepdf.esquema.cfecanc.CFeCanc;

public class CFEPDFGeradorHtml {

	private StringBuilder html;
	private String qrcode = null;

	private String css() {
		StringBuilder sb = new StringBuilder();
		sb.append("table{width: 100%;}");// width: 200pt;
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
		sb.append(".100pt{width:50%;}");// width:100pt;
		sb.append(".200pt{width:100%;}");// width:200pt;
		// sb.append(".50pt{width:50pt;}");
		// sb.append(".50pt{width:170pt;}");
		// sb.append(".50pt{width:30pt;}");
		return sb.toString();
	}

	private String cabecalho(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"cabecalho 200pt sep\">");
		sb.append(cfe.getInfCFe().getEmit().getxNome() + "<br/>");
		sb.append(cfe.getInfCFe().getEmit().getEnderEmit().getxLgr() + "<br/>");
		sb.append("CNPJ: " + this.formataCNPJouCPF(cfe.getInfCFe().getEmit().getCnpj()) + " IE: "
				+ cfe.getInfCFe().getEmit().getIe());
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	private String cabecalhoCanc(CFeCanc cfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"cabecalho 200pt sep\">");
		sb.append(cfe.getInfCFe().getEmit().getxNome() + "<br/>");
		sb.append(cfe.getInfCFe().getEmit().getEnderEmit().getxLgr() + "<br/>");
		sb.append("CNPJ: " + this.formataCNPJouCPF(cfe.getInfCFe().getEmit().getCnpj()) + " IE: "
				+ cfe.getInfCFe().getEmit().getIe());
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	private String extrato(CFe cfe) {

		String modulo = "SAT";

		if (cfe.getInfCFe().getIde().getcUF().equals("23")) {
			modulo = "MFE";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"extrato 200pt sep\">");
		sb.append("Extrato N&#176; " + cfe.getInfCFe().getIde().getnCFe() + "<br/>");
		sb.append("CUPOM FISCAL ELETR&Ocirc;NICO - " + modulo);
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	private String consumidor(CFe cfe) {

		String dadosConsumidor = "N&atilde;o informado";
		if (cfe.getInfCFe().getDest() != null) {
			if (cfe.getInfCFe().getDest().getCpf() != null)
				dadosConsumidor = this.formataCNPJouCPF(cfe.getInfCFe().getDest().getCpf());
			else if (cfe.getInfCFe().getDest().getCnpj() != null)
				dadosConsumidor = this.formataCNPJouCPF(cfe.getInfCFe().getDest().getCnpj());
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

		for (Det det : cfe.getInfCFe().getDet()) {

			String nItem = String.format("%-4s", String.format("%03d", Integer.parseInt(det.getnItem().toString())))
					.replace(" ", "&nbsp;");
			;
			String xProd = det.getProd().getxProd();
			String cProd = det.getProd().getcProd();
			String qCom = this.formataNumero(det.getProd().getqCom());
			String uCom = det.getProd().getuCom();
			String vUnCom = this.formataNumero(det.getProd().getvUnCom());
			String vItem12741 = det.getImposto().getvItem12741() == null ? "0,00"
					: this.formataNumero(det.getImposto().getvItem12741());
			String vProd = this.formataNumero(det.getProd().getvProd());

			sb.append(String.format("%1$s %2$s %3$s", nItem, cProd, xProd) + "<br/>");
			sb.append(String.format("%s %s &times; %s (%s) %s", qCom, uCom, vUnCom, vItem12741, vProd));
			sb.append("<br/>");

			if (det.getProd().getvDesc() != null && Double.parseDouble(det.getProd().getvDesc()) > 0) {
				sb.append(String.format("desconto sobre item%s",
						String.format("%1$24s", this.formataNumero(det.getProd().getvDesc()))));
				sb.append("<br/>");
			}

			if (det.getProd().getvRatDesc() != null && Double.parseDouble(det.getProd().getvRatDesc()) > 0) {
				sb.append(String.format("rateio de desconto sobre subtotal%s", String
						.format("%1$10s", this.formataNumero(det.getProd().getvRatDesc())).replace(" ", "&nbsp;")));
				sb.append("<br/>");
			}
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
		sb.append(this.formataNumero(cfe.getInfCFe().getTotal().getvCFe()));
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(String.format("%1$20s", "paulo"));
		System.out.println(String.format("rateio de desconto sobre subtotal%s", String.format("%1$10s", "10.00")));

		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		System.out.println(nf.format(1.98999999));

		/*
		 * NumberFormat nf = new DecimalFormat("#,##0.00", new DecimalFormatSymbols (new
		 * Locale ("pt", "BR"))); double valor = 78945; System.out.println (nf.format
		 * (valor / 100));
		 */
	}

	private String desconto(CFe cfe) {

		// NumberFormat nf = new DecimalFormat ("#,##0.00", new DecimalFormatSymbols
		// (new Locale ("pt", "BR")));
		// double valor = 78945;
		// System.out.println (nf.format (valor / 100));

		StringBuilder sb = new StringBuilder();
		if (cfe.getInfCFe().getTotal().getIcmsTot().getvDesc() != null) {
			Double totVprod = 0.00;
			for (Det det : cfe.getInfCFe().getDet()) {
				totVprod += Double.parseDouble(det.getProd().getvProd());
			}
			if (totVprod > 0) {
				sb.append("<tr>");
				sb.append("<td class=\"170pt\">");
				sb.append("Total bruto R&#36;");
				sb.append("</td>");
				sb.append("<td class=\"direita 300pt\">");
				sb.append(this.formataNumero(totVprod.toString()));
				sb.append("</td>");
				sb.append("</tr>");
			}
			if (cfe.getInfCFe().getTotal().getIcmsTot().getvDesc() != null
					&& Double.parseDouble(cfe.getInfCFe().getTotal().getIcmsTot().getvDesc()) > 0) {
				sb.append("<tr>");
				sb.append("<td class=\"170pt\">");
				sb.append("Desconto/acrescimo sobre item R&#36;");
				sb.append("</td>");
				sb.append("<td class=\"direita 30pt\">");
				sb.append(this.formataNumero(cfe.getInfCFe().getTotal().getIcmsTot().getvDesc()));
				sb.append("</td>");
				sb.append("</tr>");
			}
			if (cfe.getInfCFe().getTotal().getDescAcrEntr() != null) {
				if (cfe.getInfCFe().getTotal().getDescAcrEntr().getvDescSubtot() != null
						&& Double.parseDouble(cfe.getInfCFe().getTotal().getDescAcrEntr().getvDescSubtot()) > 0) {
					sb.append("<tr>");
					sb.append("<td class=\"170pt\">");
					sb.append("Desconto sobre subtotal R&#36;");
					sb.append("</td>");
					sb.append("<td class=\"direita 30pt\">");
					sb.append(this.formataNumero(cfe.getInfCFe().getTotal().getDescAcrEntr().getvDescSubtot()));
					sb.append("</td>");
					sb.append("</tr>");
				}
			}
		}
		return sb.toString();
	}

	private String pagamento(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		for (MP mp : cfe.getInfCFe().getPgto().getMp()) {
			String meioPagamento = "Outros";

			if (mp.getcMP().equals("01")) {
				meioPagamento = "Dinheiro";
			} else if (mp.getcMP().equals("02")) {
				meioPagamento = "Cheque";
			} else if (mp.getcMP().equals("03") || mp.getcMP().equals("04")) {
				meioPagamento = "Cart&atilde;o";
			}

			sb.append("<tr>");
			sb.append("<td>");
			sb.append(meioPagamento);
			sb.append("</td>");
			sb.append("<td class=\"direita\">");
			sb.append(this.formataNumero(mp.getvMP()));
			sb.append("</td>");
			sb.append("</tr>");
		}

		if (cfe.getInfCFe().getPgto().getvTroco() != null && !cfe.getInfCFe().getPgto().getvTroco().equals("0.00")) {

			sb.append("<tr>");
			sb.append("<td>Troco</td>");
			sb.append("<td class=\"direita\">");
			sb.append(this.formataNumero(cfe.getInfCFe().getPgto().getvTroco()));
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
		if (cfe.getInfCFe().getTotal().getvCFeLei12741() != null) {
			sb.append(String.format(
					"Valor aproximado dos tributos deste cupom R&#36; %s (conforme Lei Federal 12.741/2012)<br/>",
					this.formataNumero(cfe.getInfCFe().getTotal().getvCFeLei12741())));
		}
		if (cfe.getInfCFe().getInfAdic() != null) {
			if (cfe.getInfCFe().getInfAdic().getInfCpl() != null
					&& !cfe.getInfCFe().getInfAdic().getInfCpl().equals(""))
				sb.append(cfe.getInfCFe().getInfAdic().getInfCpl().replace("|", "<br/>"));
		}
		sb.append("</td>");
		sb.append("</tr>");

		return sb.toString();
	}

	private String autorizacao(CFe cfe) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"extrato 200pt\">");
		sb.append("SAT N&#176; " + cfe.getInfCFe().getIde().getNserieSAT() + "<br/>");
		sb.append(this.formataData(cfe.getInfCFe().getIde().getdEmi()) + " "
				+ this.formataHora(cfe.getInfCFe().getIde().gethEmi()));
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
		if (this.qrcode != null) {
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

	CFEPDFGeradorHtml(CFe cfe, String qrcode) {
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
		this.html.append(this.desconto(cfe));
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

	public CFEPDFGeradorHtml(CFeCanc cfeCanc, String qrcode) {

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
		this.html.append(this.cabecalhoCanc(cfeCanc));
		this.html.append(this.extratoCanc(cfeCanc));
		this.html.append(this.consumidorCanc(cfeCanc));
		this.html.append(this.totalCanc(cfeCanc));
		this.html.append(this.autorizacaoCanc(cfeCanc));
		this.html.append(this.chaveCanc(cfeCanc));
		this.html.append(this.qrcodeCanc(cfeCanc));
		this.html.append("</table>");
		this.html.append("</body>");
		this.html.append("</html>");

	}

	private Object qrcodeCanc(CFeCanc cfeCanc) {
		StringBuilder sb = new StringBuilder();
		if (this.qrcode != null) {
			sb.append("<tr>");
			sb.append("<td colspan=\"2\" align=\"center\" class=\"200pt\">");
			sb.append("<qrcode value=\"" + this.qrcode + "\"/>");
			sb.append("</td>");
			sb.append("</tr>");
		}
		return sb.toString();
	}

	private Object chaveCanc(CFeCanc cfeCanc) {
		String chave = cfeCanc.getInfCFe().getId().substring(3);
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

	private Object autorizacaoCanc(CFeCanc cfeCanc) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"extrato 200pt\">");
		sb.append("SAT N&#176; " + cfeCanc.getInfCFe().getIde().getNserieSAT() + "<br/>");
		sb.append(this.formataData(cfeCanc.getInfCFe().getIde().getdEmi()) + " "
				+ this.formataHora(cfeCanc.getInfCFe().getIde().gethEmi()));
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	private Object totalCanc(CFeCanc cfeCanc) {
		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td class=\"total 100pt\">");
		sb.append("VALOR TOTAL R&#36;");
		sb.append("</td>");
		sb.append("<td class=\"total direita 100pt\">");
		sb.append(this.formataNumero(cfeCanc.getInfCFe().getTotal().getvCFe()));
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	private Object consumidorCanc(CFeCanc cfeCanc) {
		String dadosConsumidor = "N&atilde;o informado";
		if (cfeCanc.getInfCFe().getDest() != null) {
			if (cfeCanc.getInfCFe().getDest().getCpf() != null)
				dadosConsumidor = cfeCanc.getInfCFe().getDest().getCpf();
			else if (cfeCanc.getInfCFe().getDest().getCnpj() != null)
				dadosConsumidor = cfeCanc.getInfCFe().getDest().getCnpj();
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"200pt sep\">");
		sb.append("CPF/CNPJ do CONSUMIDOR: " + dadosConsumidor);
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	private Object extratoCanc(CFeCanc cfeCanc) {

		String modulo = "SAT";

		if (cfeCanc.getInfCFe().getIde().getcUF().equals("23")) {
			modulo = "MFE";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<tr>");
		sb.append("<td colspan=\"2\" class=\"extrato 200pt sep\">");
		sb.append("Extrato N&#176; " + cfeCanc.getInfCFe().getIde().getnCFe() + "<br/>");
		sb.append("CUPOM FISCAL ELETR&Ocirc;NICO - " + modulo + "<br/>");
		sb.append("CANCELAMENTO");
		sb.append("</td>");
		sb.append("</tr>");
		return sb.toString();
	}

	public CFEPDFGeradorHtml() {

	}

	/**
	 * Converte um texto em html
	 * 
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
		sb.append(css);
		sb.append(".200pt{width:200pt;}");
		sb.append("</style>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<td class=\"200pt\">");
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

	private String formataCNPJouCPF(String arg) {
		if (arg.length() == 11) {
			return arg.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
		} else if (arg.length() == 14) {
			return arg.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
		}

		return arg;
	}

	private String formataNumero(String valor) {
		DecimalFormat formatter = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
		symbols.setCurrencySymbol("");
		formatter.setDecimalFormatSymbols(symbols);
		return formatter.format(Double.parseDouble(valor));
	}

}
