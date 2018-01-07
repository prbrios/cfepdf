package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PIS")
@XmlAccessorType(XmlAccessType.FIELD)
public class PIS {

	@XmlElement(name = "PISAliq")
	private PISAliq pisAliq;

	@XmlElement(name = "PISQtde")
	private PISQtde pisQTDe;

	@XmlElement(name = "PISNT")
	private PISNT pisNT;

	@XmlElement(name = "PISOutr")
	private PISOutr pisOutr;

	public PISQtde getPisQTDe() {
		return pisQTDe;
	}

	public void setPisQTDe(PISQtde pisQTDe) {
		this.pisQTDe = pisQTDe;
	}

	public PISNT getPisNT() {
		return pisNT;
	}

	public void setPisNT(PISNT pisNT) {
		this.pisNT = pisNT;
	}

	public PISOutr getPisOutr() {
		return pisOutr;
	}

	public void setPisOutr(PISOutr pisOutr) {
		this.pisOutr = pisOutr;
	}

	public PISAliq getPisAliq() {
		return pisAliq;
	}

	public void setPisAliq(PISAliq pisAliq) {
		this.pisAliq = pisAliq;
	}

}
