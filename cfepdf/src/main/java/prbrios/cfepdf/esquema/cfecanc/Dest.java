package prbrios.cfepdf.esquema.cfecanc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dest")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dest {

	@XmlElement(name = "CPF")
	private String cpf;

	@XmlElement(name = "CNPJ")
	private String cnpj;

	@XmlElement(name = "xNome")
	private String xNome;

	public String getCpf() {
		return cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getxNome() {
		return xNome;
	}

}
