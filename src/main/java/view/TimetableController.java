package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBException;

import classes.from.xsd.Dzien;
import classes.from.xsd.Prowadzacy;
import classes.from.xsd.Zajecia;
import javafx.fxml.FXML;
import main.Main;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import logic.JAXBLogic;

public class TimetableController {

	@FXML
	Label mondayTimelbl1;
	@FXML
	Label mondaySubjectLbl1;
	@FXML
	Label mondayTeachersLbl1;
	@FXML
	Label mondayPlaceLbl1;
	@FXML
	Label mondayTimeLbl2;
	@FXML
	Label mondaySubjectLbl2;
	@FXML
	Label mondayTeachersLbl2;
	@FXML
	Label mondayPlaceLbl2;
	@FXML
	Label mondayTimeLbl3;
	@FXML
	Label mondaySubjectLbl3;
	@FXML
	Label mondayTeachresLbl3;
	@FXML
	Label mondayPlaceLbl3;
	@FXML
	Label mondayTimeLbl4;
	@FXML
	Label mondaySubjectLbl4;
	@FXML
	Label mondayTeachersLbl4;
	@FXML
	Label mondayPlaceLbl4;
	@FXML
	Label mondayTimeLbl5;
	@FXML
	Label mondaySubjectLbl5;
	@FXML
	Label mondayTeachersLbl5;
	@FXML
	Label mondayPlaceLbl5;
	@FXML Label tuesdayTimelbl1;
	@FXML Label tuesdaySubjectLbl1;
	@FXML Label tuesdayTeachersLbl1;
	@FXML Label tuesdayPlaceLbl1;
	@FXML Label tuesdayTimeLbl2;
	@FXML Label tuesdaySubjectLbl2;
	@FXML Label tuesdayTeachersLbl2;
	@FXML Label tuesdayPlaceLbl2;
	@FXML Label tuesdayTimeLbl3;
	@FXML Label tuesdaySubjectLbl3;
	@FXML Label tuesdayTeachresLbl3;
	@FXML Label tuesdayPlaceLbl3;
	@FXML Label tuesdayTimeLbl4;
	@FXML Label tuesdaySubjectLbl4;
	@FXML Label tuesdayTeachersLbl4;
	@FXML Label tuesdayPlaceLbl4;
	@FXML Label tuesdayTimeLbl5;
	@FXML Label tuesdaySubjectLbl5;
	@FXML Label tuesdayTeachersLbl5;
	@FXML Label tuesdayPlaceLbl5;
	@FXML Label wednesdayTimelbl1;
	@FXML Label wednesdaySubjectLbl1;
	@FXML Label wednesdayTeachersLbl1;
	@FXML Label wednesdayPlaceLbl1;
	@FXML Label wednesdayTimeLbl2;
	@FXML Label wednesdaySubjectLbl2;
	@FXML Label wednesdayTeachersLbl2;
	@FXML Label wednesdayPlaceLbl2;
	@FXML Label wednesdayTimeLbl3;
	@FXML Label wednesdaySubjectLbl3;
	@FXML Label wednesdayTeachresLbl3;
	@FXML Label wednesdayPlaceLbl3;
	@FXML Label wednesdayTimeLbl4;
	@FXML Label wednesdaySubjectLbl4;
	@FXML Label wednesdayTeachersLbl4;
	@FXML Label wednesdayPlaceLbl4;
	@FXML Label wednesdayTimeLbl5;
	@FXML Label wednesdaySubjectLbl5;
	@FXML Label wednesdayTeachersLbl5;
	@FXML Label wednesdayPlaceLbl5;
	@FXML Label thursdayTimelbl1;
	@FXML Label thursdaySubjectLbl1;
	@FXML Label thursdayTeachersLbl1;
	@FXML Label thursdayPlaceLbl1;
	@FXML Label thursdayTimeLbl2;
	@FXML Label thursdaySubjectLbl2;
	@FXML Label thursdayTeachersLbl2;
	@FXML Label thursdayPlaceLbl2;
	@FXML Label thursdayTimeLbl3;
	@FXML Label thursdaySubjectLbl3;
	@FXML Label thursdayTeachresLbl3;
	@FXML Label thursdayPlaceLbl3;
	@FXML Label thursdayTimeLbl4;
	@FXML Label thursdaySubjectLbl4;
	@FXML Label thursdayTeachersLbl4;
	@FXML Label thursdayPlaceLbl4;
	@FXML Label thursdayTimeLbl5;
	@FXML Label thursdaySubjectLbl5;
	@FXML Label thursdayTeachersLbl5;
	@FXML Label thursdayPlaceLbl5;
	@FXML Label fridayTimelbl1;
	@FXML Label fridaySubjectLbl1;
	@FXML Label fridayTeachersLbl1;
	@FXML Label fridayPlaceLbl1;
	@FXML Label fridayTimeLbl2;
	@FXML Label fridaySubjectLbl2;
	@FXML Label fridayTeachersLbl2;
	@FXML Label fridayPlaceLbl2;
	@FXML Label fridayTimeLbl3;
	@FXML Label fridaySubjectLbl3;
	@FXML Label fridayTeachresLbl3;
	@FXML Label fridayPlaceLbl3;
	@FXML Label fridayTimeLbl4;
	@FXML Label fridaySubjectLbl4;
	@FXML Label fridayTeachersLbl4;
	@FXML Label fridayPlaceLbl4;
	@FXML Label fridayTimeLbl5;
	@FXML Label fridaySubjectLbl5;
	@FXML Label fridayTeachersLbl5;
	@FXML Label fridayPlaceLbl5;

	@FXML
	void initialize() throws JAXBException {
		
		
		ArrayList<Label> mondayTeachersLblList = new ArrayList<>(Arrays.asList(mondayTeachersLbl1, mondayTeachersLbl2, mondayTeachresLbl3, mondayTeachersLbl4, mondayTeachersLbl5 ));
		ArrayList<Label> mondayPlaceLblList = new ArrayList<>(Arrays.asList(mondayPlaceLbl1, mondayPlaceLbl2, mondayPlaceLbl3, mondayPlaceLbl4, mondayPlaceLbl5 ));
		ArrayList<Label> mondayTimeLblList = new ArrayList<>(Arrays.asList(mondayTimelbl1, mondayTimeLbl2, mondayTimeLbl3, mondayTimeLbl4, mondayTimeLbl5));
		ArrayList<Label> mondaySubjectLblList = new ArrayList<>(Arrays.asList(mondaySubjectLbl1, mondaySubjectLbl2, mondaySubjectLbl3, mondaySubjectLbl4, mondaySubjectLbl5));
		
		ArrayList<Label> tuesdayTeachersLblList = new ArrayList<>(Arrays.asList(tuesdayTeachersLbl1, tuesdayTeachersLbl2, tuesdayTeachresLbl3, tuesdayTeachersLbl4, tuesdayTeachersLbl5));
		ArrayList<Label> tuesdayPlaceLblList = new ArrayList<>(Arrays.asList(tuesdayPlaceLbl1, tuesdayPlaceLbl2, tuesdayPlaceLbl3, tuesdayPlaceLbl4, tuesdayPlaceLbl5));
		ArrayList<Label> tuesdayTimeLblList = new ArrayList<>(Arrays.asList(tuesdayTimelbl1, tuesdayTimeLbl2, tuesdayTimeLbl3, tuesdayTimeLbl4, tuesdayTimeLbl5));
		ArrayList<Label> tuesdaySubjectLblList = new ArrayList<>(Arrays.asList(tuesdaySubjectLbl1, tuesdaySubjectLbl2, tuesdaySubjectLbl3, tuesdaySubjectLbl4, tuesdaySubjectLbl5));

		ArrayList<Label> wednesdayTeachersLblList = new ArrayList<>(Arrays.asList(wednesdayTeachersLbl1, wednesdayTeachersLbl2, wednesdayTeachresLbl3, wednesdayTeachersLbl4, wednesdayTeachersLbl5));
		ArrayList<Label> wednesdayPlaceLblList = new ArrayList<>(Arrays.asList(wednesdayPlaceLbl1, wednesdayPlaceLbl2, wednesdayPlaceLbl3, wednesdayPlaceLbl4, wednesdayPlaceLbl5));
		ArrayList<Label> wednesdayTimeLblList = new ArrayList<>(Arrays.asList(wednesdayTimelbl1, wednesdayTimeLbl2, wednesdayTimeLbl3, wednesdayTimeLbl4, wednesdayTimeLbl5));
		ArrayList<Label> wednesdaySubjectLblList = new ArrayList<>(Arrays.asList(wednesdaySubjectLbl1, wednesdaySubjectLbl2, wednesdaySubjectLbl3, wednesdaySubjectLbl4, wednesdaySubjectLbl5));
		
		ArrayList<Label> thursdayTeachersLblList = new ArrayList<>(Arrays.asList(thursdayTeachersLbl1, thursdayTeachersLbl2, thursdayTeachresLbl3, thursdayTeachersLbl4, thursdayTeachersLbl5));
		ArrayList<Label> thursdayPlaceLblList = new ArrayList<>(Arrays.asList(thursdayPlaceLbl1, thursdayPlaceLbl2, thursdayPlaceLbl3, thursdayPlaceLbl4, thursdayPlaceLbl5));
		ArrayList<Label> thursdayTimeLblList = new ArrayList<>(Arrays.asList(thursdayTimelbl1, thursdayTimeLbl2, thursdayTimeLbl3, thursdayTimeLbl4, thursdayTimeLbl5));
		ArrayList<Label> thursdaySubjectLblList = new ArrayList<>(Arrays.asList(thursdaySubjectLbl1, thursdaySubjectLbl2, thursdaySubjectLbl3, thursdaySubjectLbl4, thursdaySubjectLbl5));
		
		ArrayList<Label> fridayTeachersLblList = new ArrayList<>(Arrays.asList(fridayTeachersLbl1, fridayTeachersLbl2, fridayTeachresLbl3, fridayTeachersLbl4, fridayTeachersLbl5));
		ArrayList<Label> fridayPlaceLblList = new ArrayList<>(Arrays.asList(fridayPlaceLbl1, fridayPlaceLbl2, fridayPlaceLbl3, fridayPlaceLbl4, fridayPlaceLbl5));
		ArrayList<Label> fridayTimeLblList = new ArrayList<>(Arrays.asList(fridayTimelbl1, fridayTimeLbl2, fridayTimeLbl3, fridayTimeLbl4, fridayTimeLbl5));
		ArrayList<Label> fridaySubjectLblList = new ArrayList<>(Arrays.asList(fridaySubjectLbl1, fridaySubjectLbl2, fridaySubjectLbl3, fridaySubjectLbl4, fridaySubjectLbl5));
		
		
		List<ArrayList<Label>> teachersLblList = new ArrayList<ArrayList<Label>>();
		teachersLblList.add(mondayTeachersLblList);
		teachersLblList.add(tuesdayTeachersLblList);
		teachersLblList.add(wednesdayTeachersLblList);
		teachersLblList.add(thursdayTeachersLblList);
		teachersLblList.add(fridayTeachersLblList);
		
		List<ArrayList<Label>> placeLblList = new ArrayList<ArrayList<Label>>();
		placeLblList.add(mondayPlaceLblList);
		placeLblList.add(tuesdayPlaceLblList);
		placeLblList.add(wednesdayPlaceLblList);
		placeLblList.add(thursdayPlaceLblList);
		placeLblList.add(fridayPlaceLblList);
		
		List<ArrayList<Label>> timeLblList = new ArrayList<ArrayList<Label>>();
		timeLblList.add(mondayTimeLblList);
		timeLblList.add(tuesdayTimeLblList);
		timeLblList.add(wednesdayTimeLblList);
		timeLblList.add(thursdayTimeLblList);
		timeLblList.add(fridayTimeLblList);
		
		List<ArrayList<Label>> subjectLblList = new ArrayList<ArrayList<Label>>();
		subjectLblList.add(mondaySubjectLblList);
		subjectLblList.add(tuesdaySubjectLblList);
		subjectLblList.add(wednesdaySubjectLblList);
		subjectLblList.add(thursdaySubjectLblList);
		subjectLblList.add(fridaySubjectLblList);
		
		try {
			JAXBLogic.readFromXML();
			
			int j = 0;
			for (Dzien day : JAXBLogic.zbiorPlanowZajec.getPlan().getDzieñ())     
			{
				for(Zajecia z : day.getZajecia()){
					if(z.getRodzaj().equals("okienko")){
						
					}
					else{
						int i = z.getBlok() - 1;
						String time = new String(z.getCzas().getStart() + " - " + z.getCzas().getKoniec());
						String place = new String(z.getBudynek().getNumer() + ", " + z.getBudynek().getNumerSali());
						String teachers = new String("");
						for (Prowadzacy p : z.getProwadzacy()) {
							teachers += p.getTytul() + " " + p.getImie() + " " + p.getNazwisko() + "\n";
						}
						subjectLblList.get(j).get(i).setText(z.getPrzedmiot());
						timeLblList.get(j).get(i).setText(time);
						placeLblList.get(j).get(i).setText(place);
						teachersLblList.get(j).get(i).setText(teachers);
					}
				}
				j++;
			}
			
			
		} catch (FileNotFoundException e) {
			Alert info = new Alert(AlertType.ERROR);
			info.setTitle("Plik nie istnieje");
			info.setHeaderText("Plik nie istnieje");
			info.setContentText(e.getMessage());
			info.showAndWait();
		}
		
		
	}

	@FXML
	public void backBtnOnClick() throws IOException {
		Main.showMainWindow();
	}

}
