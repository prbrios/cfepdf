package prbrios.cfepdf.esquema.cfecanc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="total")
@XmlAccessorType(XmlAccessType.FIELD)
public class Total {

	@XmlElement(name="vCFe")
	private String vCFe;

	public String getvCFe() {
		return vCFe;
	}
	
}
