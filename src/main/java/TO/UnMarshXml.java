package TO;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshXml {

	public UnMarshXml() {
		// TODO Auto-generated constructor stub
	}
	private static final String FILE_NAME = "jaxb-emp.xml";
	
	public static PropertyDetails jaxbXMLToObject(String xml) {
        try {
            JAXBContext context = JAXBContext.newInstance(PropertyDetails.class);
            Unmarshaller un = context.createUnmarshaller();
            PropertyDetails pd = (PropertyDetails) un.unmarshal(new File(FILE_NAME));
            return pd;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


}
