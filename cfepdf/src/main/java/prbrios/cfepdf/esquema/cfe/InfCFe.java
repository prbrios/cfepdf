package prbrios.cfepdf.esquema.cfe;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="infCFe")
@XmlAccessorType(XmlAccessType.FIELD)
public class InfCFe {

	@XmlElement(name="ide")
	private Ide ide;
	
	@XmlElement(name="emit")
	private Emit emit;
	
	@XmlElement(name="dest")
	private Dest dest;
	
	@XmlElement(name="det")
	private List<Det> det = new ArrayList<Det>();
	
	@XmlElement(name="total")
	private Total total;

	@XmlElement(name="pgto")
	private Pgto pgto;
	
	@XmlElement(name="infAdic")
	private InfAdic infAdic;

	@XmlAttribute(name="versaoDadosEnt")
	private String versaoDadosEnt = "0.07";
	
	@XmlAttribute(name="Id")
	private String id;
	
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

	public Dest getDest() {
		return dest;
	}

	public void setDest(Dest dest) {
		this.dest = dest;
	}

	public List<Det> getDet() {
		return det;
	}

	public void setDet(List<Det> det) {
		this.det = det;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}

	public InfAdic getInfAdic() {
		return infAdic;
	}

	public void setInfAdic(InfAdic infAdic) {
		this.infAdic = infAdic;
	}

	public Pgto getPgto() {
		return pgto;
	}

	public void setPgto(Pgto pgto) {
		this.pgto = pgto;
	}

	public String getVersaoDadosEnt() {
		return versaoDadosEnt;
	}

	public void setVersaoDadosEnt(String versaoDadosEnt) {
		this.versaoDadosEnt = versaoDadosEnt;
	}

	public String getId() {
		return id;
	}
	
}
