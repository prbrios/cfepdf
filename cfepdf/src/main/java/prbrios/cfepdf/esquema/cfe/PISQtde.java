package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PISQtde")
@XmlAccessorType(XmlAccessType.FIELD)
public class PISQtde {

	@XmlElement(name = "CST")
	private String cst;

	@XmlElement(name = "qBCProd")
	private String qBCProd;

	@XmlElement(name = "vAliqProd")
	private String vAliqProd;

	@XmlElement(name = "vPIS")
	private String vPIS;

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public String getqBCProd() {
		return qBCProd;
	}

	public void setqBCProd(String qBCProd) {
		this.qBCProd = qBCProd;
	}

	public String getvAliqProd() {
		return vAliqProd;
	}

	public void setvAliqProd(String vAliqProd) {
		this.vAliqProd = vAliqProd;
	}

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}

}
