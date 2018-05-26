package xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XmlOps implements Commons{

	public static BDPC readXmlInput() throws JAXBException{
		File file = new File(XmlInputPath);
		JAXBContext jaxbContext = JAXBContext.newInstance(BDPC.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		BDPC bdpc = (BDPC) jaxbUnmarshaller.unmarshal(file);
		
		return bdpc;
	}



}
