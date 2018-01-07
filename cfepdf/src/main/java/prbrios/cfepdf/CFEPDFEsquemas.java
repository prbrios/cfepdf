package prbrios.cfepdf;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import prbrios.cfepdf.esquema.cfe.CFe;
import prbrios.cfepdf.esquema.cfecanc.CFeCanc;

public class CFEPDFEsquemas {

	public CFe objetoCFe(String xmlCFe) throws CFEPDFException {
		try {
			InputStream stream = new ByteArrayInputStream(xmlCFe.getBytes(StandardCharsets.UTF_8.name()));
			JAXBContext context = JAXBContext.newInstance(CFe.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (CFe) unmarshaller.unmarshal(stream);
		}catch(Exception e) {
			throw new CFEPDFException(e.getMessage());
		}
	}
	
	public CFeCanc objetoCFeCanc(String xmlCFeCanc) throws CFEPDFException {		
		try {
			InputStream stream = new ByteArrayInputStream(xmlCFeCanc.getBytes(StandardCharsets.UTF_8.name()));
			JAXBContext context = JAXBContext.newInstance(CFeCanc.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (CFeCanc) unmarshaller.unmarshal(stream);
		} catch (Exception e) {
			throw new CFEPDFException(e.getMessage());
		}
	}
	
}
