package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ICMS40")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMS40 {

	@XmlElement(name = "Orig")
	private String orig;

	@XmlElement(name = "CST")
	private String cst;

	@XmlElement(name = "vICMS")
	private String vICMS;

	@XmlElement(name = "motDesICMS")
	private String motDesICMS;

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

	public String getMotDesICMS() {
		return motDesICMS;
	}

	public void setMotDesICMS(String motDesICMS) {
		this.motDesICMS = motDesICMS;
	}

}
