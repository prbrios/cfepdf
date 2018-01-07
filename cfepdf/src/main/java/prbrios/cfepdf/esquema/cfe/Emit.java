package prbrios.cfepdf.esquema.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="emit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Emit {

	@XmlElement(name="CNPJ")
	private String cnpj;
	
	@XmlElement(name="IE")
	private String ie;
	
	@XmlElement(name="indRatISSQN")
	private String indRatISSQN;

	@XmlElement(name="xNome")
	private String xNome;
	
	@XmlElement(name="xFant")
	private String xFant;
	
	@XmlElement(name="enderEmit")
	private EnderEmit enderEmit;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getIndRatISSQN() {
		return indRatISSQN;
	}

	public void setIndRatISSQN(String indRatISSQN) {
		this.indRatISSQN = indRatISSQN;
	}

	public String getxNome() {
		return xNome;
	}

	public String getxFant() {
		return xFant;
	}

	public EnderEmit getEnderEmit() {
		return enderEmit;
	}
	
}
