package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="COFINSAliq")
@XmlAccessorType(XmlAccessType.FIELD)
public class COFINSAliq {

	@XmlElement(name="CST")
	private String cst;
	
	@XmlElement(name="vBC")
	private String vBC;
	
	@XmlElement(name="pCOFINS")
	private String pCOFINS;

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpCOFINS() {
		return pCOFINS;
	}

	public void setpCOFINS(String pCOFINS) {
		this.pCOFINS = pCOFINS;
	}

}
