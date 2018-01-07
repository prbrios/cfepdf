package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ICMS90")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICMS90 {

	@XmlElement(name = "Orig")
	private String orig;

	@XmlElement(name = "cst")
	private String cst;

	@XmlElement(name = "modBC")
	private String modBC;

	@XmlElement(name = "vBC")
	private String vBC;

	@XmlElement(name = "pRedBC")
	private String pRedBC;

	@XmlElement(name = "pICMS")
	private String pICMS;

	@XmlElement(name = "vICMS")
	private String vICMS;

	@XmlElement(name = "modBCST")
	private String modBCST;

	@XmlElement(name = "pMVAST")
	private String pMVAST;

	@XmlElement(name = "pRedBCST")
	private String pRedBCST;

	@XmlElement(name = "vBCST")
	private String vBCST;

	@XmlElement(name = "pICMSST")
	private String pICMSST;

	@XmlElement(name = "vICMSST")
	private String vICMSST;

	public String getOrig() {
		return orig;
	}

	public void setOrig(String orig) {
		this.orig = orig;
	}

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public String getModBC() {
		return modBC;
	}

	public void setModBC(String modBC) {
		this.modBC = modBC;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpRedBC() {
		return pRedBC;
	}

	public void setpRedBC(String pRedBC) {
		this.pRedBC = pRedBC;
	}

	public String getpICMS() {
		return pICMS;
	}

	public void setpICMS(String pICMS) {
		this.pICMS = pICMS;
	}

	public String getvICMS() {
		return vICMS;
	}

	public void setvICMS(String vICMS) {
		this.vICMS = vICMS;
	}

	public String getModBCST() {
		return modBCST;
	}

	public void setModBCST(String modBCST) {
		this.modBCST = modBCST;
	}

	public String getpMVAST() {
		return pMVAST;
	}

	public void setpMVAST(String pMVAST) {
		this.pMVAST = pMVAST;
	}

	public String getpRedBCST() {
		return pRedBCST;
	}

	public void setpRedBCST(String pRedBCST) {
		this.pRedBCST = pRedBCST;
	}

	public String getvBCST() {
		return vBCST;
	}

	public void setvBCST(String vBCST) {
		this.vBCST = vBCST;
	}

	public String getpICMSST() {
		return pICMSST;
	}

	public void setpICMSST(String pICMSST) {
		this.pICMSST = pICMSST;
	}

	public String getvICMSST() {
		return vICMSST;
	}

	public void setvICMSST(String vICMSST) {
		this.vICMSST = vICMSST;
	}

}
