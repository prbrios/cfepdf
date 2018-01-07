package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MP")
@XmlAccessorType(XmlAccessType.FIELD)
public class MP {

	@XmlElement(name="cMP")
	private String cMP;
	
	@XmlElement(name="vMP")
	private String vMP;

	public String getcMP() {
		return cMP;
	}

	public void setcMP(String cMP) {
		this.cMP = cMP;
	}

	public String getvMP() {
		return vMP;
	}

	public void setvMP(String vMP) {
		this.vMP = vMP;
	}
	
}
