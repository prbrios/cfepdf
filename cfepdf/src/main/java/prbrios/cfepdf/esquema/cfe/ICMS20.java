package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ICMS20")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMS20 {

	@XmlElement(name = "Orig")
	private String orig;

	@XmlElement(name = "CST")
	private String cst;

	@XmlElement(name = "modBC")
	private String modBC;

	@XmlElement(name = "pRedBC")
	private String pRedBC;

	@XmlElement(name = "vBC")
	private String vBC;

	@XmlElement(name = "pICMS")
	private String pICMS;

	@XmlElement(name = "vICMS")
	private String vICMS;

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

	public String getModBC() {
		return modBC;
	}

	public void setModBC(String modBC) {
		this.modBC = modBC;
	}

	public String getpRedBC() {
		return pRedBC;
	}

	public void setpRedBC(String pRedBC) {
		this.pRedBC = pRedBC;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpICMS() {
		return pICMS;
	}

	public void setpICMS(String pICMS) {
		this.pICMS = pICMS;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

}
