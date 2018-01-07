package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class CFe {

	@XmlElement(name="infCFe")
	private InfCFe infCFe;

	public InfCFe getInfCFe() {
		return infCFe;
	}

	public void setInfCFe(InfCFe infCFe) {
		this.infCFe = infCFe;
	}
	
}
