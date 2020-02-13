package prbrios.cfepdf.esquema.cfecanc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ide")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ide {

	@XmlElement(name = "cUF")
	private String cUF;

	@XmlElement(name = "CNPJ")
	private String cnpj;

	@XmlElement(name = "signAC")
	private String signAC;

	@XmlElement(name = "numeroCaixa")
	private String numeroCaixa;

	@XmlElement(name = "nCFe")
	private String nCFe;

	@XmlElement(name = "nserieSAT")
	private String nserieSAT;

	@XmlElement(name = "dEmi")
	private String dEmi;

	@XmlElement(name = "hEmi")
	private String hEmi;

	@XmlElement(name = "assinaturaQRCODE")
	private String assinaturaQRCODE;

	public String getcUF(){
		return this.cUF;
	}

	public void setcUF(String cUF){
		this.cUF = cUF;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSignAC() {
		return signAC;
	}

	public void setSignAC(String signAC) {
		this.signAC = signAC;
	}

	public String getNumeroCaixa() {
		return numeroCaixa;
	}

	public void setNumeroCaixa(String numeroCaixa) {
		this.numeroCaixa = numeroCaixa;
	}

	public String getnCFe() {
		return nCFe;
	}

	public String getNserieSAT() {
		return nserieSAT;
	}

	public String getdEmi() {
		return dEmi;
	}

	public String gethEmi() {
		return hEmi;
	}

	public String getAssinaturaQRCODE() {
		return assinaturaQRCODE;
	}

}
