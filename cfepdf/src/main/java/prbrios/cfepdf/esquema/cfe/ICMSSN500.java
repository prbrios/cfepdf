package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ICMSSN500")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMSSN500 {

	@XmlElement(name = "Orig")
	private String orig;

	@XmlElement(name = "CSOSN")
	private String csosn;

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

	public String getCsosn() {
		return csosn;
	}

	public void setCsosn(String csosn) {
		this.csosn = csosn;
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
