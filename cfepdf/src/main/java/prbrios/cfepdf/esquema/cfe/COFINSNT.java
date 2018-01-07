package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "COFINSNT")
@XmlAccessorType(XmlAccessType.FIELD)
public class COFINSNT {

	@XmlElement(name = "CST")
	private String cst;

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}
}
