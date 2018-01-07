package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="imposto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Imposto {

	@XmlElement(name="vItem12741")
	private String vItem12741;
	
	@XmlElement(name="ICMS")
	private ICMS icms;
	
	@XmlElement(name="PIS")
	private PIS pis;
	
	@XmlElement(name="COFINS")
	private COFINS cofins;

	public String getvItem12741() {
		return vItem12741;
	}

	public void setvItem12741(String vItem12741) {
		this.vItem12741 = vItem12741;
	}

	public ICMS getIcms() {
		return icms;
	}

	public void setIcms(ICMS icms) {
		this.icms = icms;
	}

	public PIS getPis() {
		return pis;
	}

	public void setPis(PIS pis) {
		this.pis = pis;
	}

	public COFINS getCofins() {
		return cofins;
	}

	public void setCofins(COFINS cofins) {
		this.cofins = cofins;
	}
	
}
