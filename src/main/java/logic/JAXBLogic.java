package logic;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import classes.from.xsd.Zbi�rPlan�wZaj��;

public class JAXBLogic {

	private static JAXBContext jaxbContext;
	private static Unmarshaller unmarshaller;
	private static Marshaller marshaller;
	public static Zbi�rPlan�wZaj�� zbi�rPlan�wZaj��;

	static {
		try {
			jaxbContext = JAXBContext.newInstance(Zbi�rPlan�wZaj��.class);
			unmarshaller = jaxbContext.createUnmarshaller();
			marshaller = jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveToXML() throws JAXBException {

		marshaller.marshal(zbi�rPlan�wZaj��, new File("plan.xml"));
	}

	public static void readFromXML() throws JAXBException {

		zbi�rPlan�wZaj�� = (Zbi�rPlan�wZaj��) unmarshaller.unmarshal(new File("plan.xml"));
	}

}
