package logic;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import classes.from.xsd.ZbiórPlanówZajêæ;

public class JAXBLogic {

	private static JAXBContext jaxbContext;
	private static Unmarshaller unmarshaller;
	private static Marshaller marshaller;
	public static ZbiórPlanówZajêæ zbiórPlanówZajêæ;

	static {
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

		marshaller.marshal(zbiórPlanówZajêæ, new File("plan.xml"));
	}

	public static void readFromXML() throws JAXBException {

		zbiórPlanówZajêæ = (ZbiórPlanówZajêæ) unmarshaller.unmarshal(new File("plan.xml"));
	}

}
