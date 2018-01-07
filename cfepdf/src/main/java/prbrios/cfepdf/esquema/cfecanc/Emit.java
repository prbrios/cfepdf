package prbrios.cfepdf.esquema.cfecanc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "emit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Emit {

	@XmlElement(name = "CNPJ")
	private String cnpj;

	@XmlElement(name = "xNome")
	private String xNome;

	@XmlElement(name="IE")
	private String ie;
	
	@XmlElement(name = "enderEmit")
	private EnderEmit enderEmit;

	public String getCnpj() {
		return cnpj;
	}

	public String getxNome() {
		return xNome;
	}

	public EnderEmit getEnderEmit() {
		return enderEmit;
	}

	public String getIe() {
		return ie;
	}

}
