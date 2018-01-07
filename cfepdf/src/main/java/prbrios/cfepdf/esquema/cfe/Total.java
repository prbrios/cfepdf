package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "total")
@XmlAccessorType(XmlAccessType.FIELD)
public class Total {

	@XmlElement(name = "vCFeLei12741")
	private String vCFeLei12741;

	@XmlElement(name = "vCFe")
	private String vCFe;

	public String getvCFeLei12741() {
		return vCFeLei12741;
	}

	public void setvCFeLei12741(String vCFeLei12741) {
		this.vCFeLei12741 = vCFeLei12741;
	}

	public String getvCFe() {
		return vCFe;
	}

}
