package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DescAcrEntr")
@XmlAccessorType(XmlAccessType.FIELD)
public class DescAcrEntr {

	@XmlElement(name = "vDescSubtot")
	private String vDescSubtot;

	@XmlElement(name = "vAcresSubtot")
	private String vAcresSubtot;

	public String getvDescSubtot() {
		return vDescSubtot;
	}

	public String getvAcresSubtot() {
		return vAcresSubtot;
	}

}
