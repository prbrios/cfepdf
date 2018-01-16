package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ICMSTot")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMSTot {

	@XmlElement(name = "vDesc")
	private String vDesc;
	
	public String getvDesc() {
		return vDesc;
	}

}
