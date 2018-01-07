package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ICMS")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMS {

	@XmlElement(name = "ICMS00")
	private ICMS00 icms00;

	@XmlElement(name = "ICMS20")
	private ICMS20 icms20;

	@XmlElement(name = "ICMS40")
	private ICMS40 icms40;

	@XmlElement(name = "ICMS90")
	private ICMS90 icms90;

	@XmlElement(name = "ICMS60")
	private ICMS60 icms60;

	@XmlElement(name = "ICMSSN102")
	private ICMSSN102 icmssn102;

	@XmlElement(name = "ICMSSN500")
	private ICMSSN500 icmssn500;

	@XmlElement(name = "ICMSSN900")
	private ICMSSN900 icmssn900;

	@XmlElement(name = "ICMSSN300")
	private ICMSSN300 icmssn300;

	public ICMSSN300 getIcmssn300() {
		return icmssn300;
	}

	public void setIcmssn300(ICMSSN300 icmssn300) {
		this.icmssn300 = icmssn300;
	}

	public ICMSSN500 getIcmssn500() {
		return icmssn500;
	}

	public void setIcmssn500(ICMSSN500 icmssn500) {
		this.icmssn500 = icmssn500;
	}

	public ICMSSN900 getIcmssn900() {
		return icmssn900;
	}

	public void setIcmssn900(ICMSSN900 icmssn900) {
		this.icmssn900 = icmssn900;
	}

	public ICMS00 getIcms00() {
		return icms00;
	}

	public void setIcms00(ICMS00 icms00) {
		this.icms00 = icms00;
	}

	public ICMS20 getIcms20() {
		return icms20;
	}

	public void setIcms20(ICMS20 icms20) {
		this.icms20 = icms20;
	}

	public ICMSSN102 getIcmssn102() {
		return icmssn102;
	}

	public void setIcmssn102(ICMSSN102 icmssn102) {
		this.icmssn102 = icmssn102;
	}

	public ICMS60 getIcms60() {
		return icms60;
	}

	public void setIcms60(ICMS60 icms60) {
		this.icms60 = icms60;
	}

	public ICMS40 getIcms40() {
		return icms40;
	}

	public void setIcms40(ICMS40 icms40) {
		this.icms40 = icms40;
	}

	public ICMS90 getIcms90() {
		return icms90;
	}

	public void setIcms90(ICMS90 icms90) {
		this.icms90 = icms90;
	}

}
