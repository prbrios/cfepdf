package prbrios.cfepdf.esquema.cfecanc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CFeCanc")
@XmlAccessorType(XmlAccessType.FIELD)
public class CFeCanc {

	@XmlElement(name="infCFe")
	private InfCFe infCFe;

	public InfCFe getInfCFe() {
		return infCFe;
	}

	public void setInfCFe(InfCFe infCFe) {
		this.infCFe = infCFe;
	}
	
}
