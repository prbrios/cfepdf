package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ICMS60")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMS60 {

	@XmlElement(name = "Orig")
	private String orig;

	@XmlElement(name = "CST")
	private String cst = "60";

	@XmlElement(name = "vBCSTRet")
	private String vBCSTRet;

	@XmlElement(name = "vICMSSTRet")
	private String vICMSSTRet;

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

	public String getvBCSTRet() {
		return vBCSTRet;
	}

	public void setvBCSTRet(String vBCSTRet) {
		this.vBCSTRet = vBCSTRet;
	}

	public String getvICMSSTRet() {
		return vICMSSTRet;
	}

	public void setvICMSSTRet(String vICMSSTRet) {
		this.vICMSSTRet = vICMSSTRet;
	}

}
