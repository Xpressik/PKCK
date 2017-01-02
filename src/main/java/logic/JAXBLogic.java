package logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import classes.from.xsd.ZbiórPlanówZajêæ;

public class JAXBLogic {

	private static JAXBContext jaxbContext;
	private static Unmarshaller unmarshaller;
	private static Marshaller marshaller;
	private static String xmlFilePath;
	
	public static ZbiórPlanówZajêæ zbiórPlanówZajêæ;

	static {
		xmlFilePath = "plan.xml";
		try {
			jaxbContext = JAXBContext.newInstance(ZbiórPlanówZajêæ.class);
			unmarshaller = jaxbContext.createUnmarshaller();
			marshaller = jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveToXML() throws JAXBException {

		marshaller.marshal(zbiórPlanówZajêæ, new File(xmlFilePath));
	}

	public static void readFromXML() throws JAXBException, FileNotFoundException {
		zbiórPlanówZajêæ = (ZbiórPlanówZajêæ) unmarshaller.unmarshal(new FileInputStream(new File(xmlFilePath)));
	}

	public static String getXmlFilePath() {
		return xmlFilePath;
	}

	public static void setXmlFilePath(String xmlFilePath) {
		JAXBLogic.xmlFilePath = xmlFilePath;
	}

}
