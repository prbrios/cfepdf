package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "COFINS")
@XmlAccessorType(XmlAccessType.FIELD)
public class COFINS {

	@XmlElement(name = "COFINSAliq")
	private COFINSAliq cofinsAliq;

	@XmlElement(name = "COFINSQtde")
	private COFINSQtde cofinsQtde;

	@XmlElement(name = "COFINSNT")
	private COFINSNT cofinsNT;

	@XmlElement(name = "COFINSOutr")
	private COFINSOutr cofinsOutr;

	public COFINSAliq getCofinsAliq() {
		return cofinsAliq;
	}

	public void setCofinsAliq(COFINSAliq cofinsAliq) {
		this.cofinsAliq = cofinsAliq;
	}

	public COFINSQtde getCofinsQtde() {
		return cofinsQtde;
	}

	public void setCofinsQtde(COFINSQtde cofinsQtde) {
		this.cofinsQtde = cofinsQtde;
	}

	public COFINSNT getCofinsNT() {
		return cofinsNT;
	}

	public void setCofinsNT(COFINSNT cofinsNT) {
		this.cofinsNT = cofinsNT;
	}

	public COFINSOutr getCofinsOutr() {
		return cofinsOutr;
	}

	public void setCofinsOutr(COFINSOutr cofinsOutr) {
		this.cofinsOutr = cofinsOutr;
	}

}