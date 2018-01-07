package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "COFINSQtde")
@XmlAccessorType(XmlAccessType.FIELD)
public class COFINSQtde {

	@XmlElement(name = "CST")
	private String cst;

	@XmlElement(name = "qBCProd")
	private String qBCProd;

	@XmlElement(name = "vAliqProd")
	private String vAliqProd;

	@XmlElement(name = "vCOFINS")
	private String vCOFINS;

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

	public String getvCOFINS() {
		return vCOFINS;
	}

	public void setvCOFINS(String vCOFINS) {
		this.vCOFINS = vCOFINS;
	}

}
