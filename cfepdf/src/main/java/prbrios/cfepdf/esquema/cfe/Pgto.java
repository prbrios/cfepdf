package prbrios.cfepdf.esquema.cfe;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pgto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pgto {

	@XmlElement(name="MP")
	private List<MP> mp = new ArrayList<MP>();

	@XmlElement(name="vTroco")
	private String vTroco;
	
	public List<MP> getMp() {
		return mp;
	}

	public void setMp(List<MP> mp) {
		this.mp = mp;
	}
	
	public String getvTroco() {
		return vTroco;
	}

	public void setvTroco(String vTroco) {
		this.vTroco = vTroco;
	}

}
