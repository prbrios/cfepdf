package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="infAdic")
@XmlAccessorType(XmlAccessType.FIELD)
public class InfAdic {

	@XmlElement(name="infCpl")
	private String infCpl;

	public String getInfCpl() {
		return infCpl;
	}

	public void setInfCpl(String infCpl) {
		this.infCpl = infCpl;
	}
	
}
