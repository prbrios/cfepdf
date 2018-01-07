package prbrios.cfepdf.esquema.cfecanc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "enderEmit")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnderEmit {

	@XmlElement(name = "xLgr")
	private String xLgr;

	@XmlElement(name = "nro")
	private String nro;

	@XmlElement(name = "xBairro")
	private String xBairro;

	@XmlElement(name = "xMun")
	private String xMun;

	@XmlElement(name = "CEP")
	private String cep;

	public String getxLgr() {
		return xLgr;
	}

	public String getNro() {
		return nro;
	}

	public String getxBairro() {
		return xBairro;
	}

	public String getxMun() {
		return xMun;
	}

	public String getCep() {
		return cep;
	}

}
