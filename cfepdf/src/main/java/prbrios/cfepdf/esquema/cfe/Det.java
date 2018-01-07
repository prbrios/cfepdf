package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="det")
@XmlAccessorType(XmlAccessType.FIELD)
public class Det {

	@XmlAttribute(name="nItem")
	private Integer nItem;

	@XmlElement(name="prod")
	private Prod prod;

	@XmlElement(name="imposto")
	private Imposto imposto;
	
	public Integer getnItem() {
		return nItem;
	}

	public void setnItem(Integer nItem) {
		this.nItem = nItem;
	}

	public Prod getProd() {
		return prod;
	}

	public void setProd(Prod prod) {
		this.prod = prod;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
}
