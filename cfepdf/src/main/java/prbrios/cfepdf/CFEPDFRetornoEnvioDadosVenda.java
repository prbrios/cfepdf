package prbrios.cfepdf;

public class CFEPDFRetornoEnvioDadosVenda {

	private String numeroSessao;
	private String codigo1;
	private String codigo2;
	private String mensagem;
	private String cod;
	private String mensagemSEFAZ;
	private String xmlBase64;
	private String dataHoraEmissao;
	private String chaveConsulta;
	private String valorTotal;
	private String cpfCnpjAdquirente;
	private String assinaturaQRCode;
	
	CFEPDFRetornoEnvioDadosVenda(String retorno) throws CFEPDFException {
		String[] ret = retorno.split("[|]");
		if(ret.length != 12)
			throw new CFEPDFException("Retorno do CFE é inválido.");
		this.numeroSessao = ret[0];
		this.codigo1 = ret[1];
		this.codigo2 = ret[2];
		this.mensagem = ret[3];
		this.cod = ret[4];
		this.mensagemSEFAZ = ret[5];
		this.xmlBase64 = ret[6];
		this.dataHoraEmissao = ret[7];
		this.chaveConsulta = ret[8];
		this.valorTotal = ret[9];
		this.cpfCnpjAdquirente = ret[10];
		this.assinaturaQRCode = ret[11];
	}

	public String getNumeroSessao() {
		return numeroSessao;
	}

	public String getCodigo1() {
		return codigo1;
	}

	public String getCodigo2() {
		return codigo2;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getCod() {
		return cod;
	}

	public String getMensagemSEFAZ() {
		return mensagemSEFAZ;
	}

	public String getXmlBase64() {
		return xmlBase64;
	}

	public String getDataHoraEmissao() {
		return dataHoraEmissao;
	}

	public String getChaveConsulta() {
		return chaveConsulta;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public String getCpfCnpjAdquirente() {
		return cpfCnpjAdquirente;
	}

	public String getAssinaturaQRCode() {
		return assinaturaQRCode;
	}
	
}
