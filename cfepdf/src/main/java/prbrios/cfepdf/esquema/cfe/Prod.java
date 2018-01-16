package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="prod")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prod {

	@XmlElement(name="cProd")
	private String cProd;
	
	@XmlElement(name="cEAN")
	private String cEAN;
	
	@XmlElement(name="xProd")
	private String xProd;
	
	@XmlElement(name="NCM")
	private String ncm;
	
	@XmlElement(name="CFOP")
	private String cfop;
	
	@XmlElement(name="uCom")
	private String uCom;
	
	@XmlElement(name="qCom")
	private String qCom;
	
	@XmlElement(name="vUnCom")
	private String vUnCom;
	
	@XmlElement(name="indRegra")
	private String indRegra;

	@XmlElement(name="vProd")
	private String vProd;
	
	@XmlElement(name="vDesc")
	private String vDesc;
	
	public String getcProd() {
		return cProd;
	}

	public void setcProd(String cProd) {
		this.cProd = cProd;
	}

	public String getcEAN() {
		return cEAN;
	}

	public void setcEAN(String cEAN) {
		this.cEAN = cEAN;
	}

	public String getxProd() {
		return xProd;
	}

	public void setxProd(String xProd) {
		this.xProd = xProd;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public String getqCom() {
		return qCom;
	}

	public void setqCom(String qCom) {
		this.qCom = qCom;
	}

	public String getvUnCom() {
		return vUnCom;
	}

	public void setvUnCom(String vUnCom) {
		this.vUnCom = vUnCom;
	}

	public String getIndRegra() {
		return indRegra;
	}

	public void setIndRegra(String indRegra) {
		this.indRegra = indRegra;
	}

	public String getvProd() {
		return vProd;
	}

	public String getvDesc() {
		return vDesc;
	}
	
}
