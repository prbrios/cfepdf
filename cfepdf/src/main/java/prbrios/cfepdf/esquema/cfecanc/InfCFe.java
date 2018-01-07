package prbrios.cfepdf.esquema.cfecanc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "infCFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class InfCFe {

	@XmlAttribute(name = "Id")
	private String id;

	@XmlAttribute(name = "chCanc")
	private String chCanc;

	@XmlElement(name = "ide")
	private Ide ide;

	@XmlElement(name = "emit")
	private Emit emit;

	@XmlElement(name = "dest")
	private Dest dest;

	@XmlElement(name = "total")
	private Total total;

	public String getChCanc() {
		return chCanc;
	}

	public void setChCanc(String chCanc) {
		this.chCanc = chCanc;
	}

	public Ide getIde() {
		return ide;
	}

	public void setIde(Ide ide) {
		this.ide = ide;
	}

	public Emit getEmit() {
		return emit;
	}

	public void setEmit(Emit emit) {
		this.emit = emit;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}

	public Dest getDest() {
		return dest;
	}

	public void setDest(Dest dest) {
		this.dest = dest;
	}

	public String getId() {
		return id;
	}

}
