package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ICMSSN102")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMSSN102 {

	@XmlElement(name="Orig")
	private String orig;
	
	@XmlElement(name="CSOSN")
	private String csosn;

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
	
}
