package view;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import classes.from.xsd.Autor;
import classes.from.xsd.Budynek;
import classes.from.xsd.Czas;
import classes.from.xsd.Dzie�;
import classes.from.xsd.Prowadz�cy;
import classes.from.xsd.Zaj�cia;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import logic.JAXBLogic;
import main.Main;

public class TimetableController {

	@FXML
	TableView<Dzie�> tbl;
	@FXML
	TableColumn<Zaj�cia, String> column1;
	@FXML
	TableColumn column2;
	@FXML
	TableColumn column3;
	@FXML
	TableColumn column4;
	@FXML
	TableColumn column5;
	@FXML
	TableColumn<Czas, String> timeColumn;
	@FXML
	TableColumn<List<Prowadz�cy>, String> teacherColumn;
	@FXML
	TableColumn<Zaj�cia, String> subjectColumn;
	@FXML
	TableColumn<Budynek, String> placeColumn;
	
	@FXML
	void initialize() throws JAXBException{
		column1.setCellValueFactory(new PropertyValueFactory<Zaj�cia, String>("Zaj�cia"));
		timeColumn.setCellValueFactory(new PropertyValueFactory<Czas, String>("Czas"));
		teacherColumn.setCellValueFactory(new PropertyValueFactory<List<Prowadz�cy>, String>("Prowadz�cy"));
		subjectColumn.setCellValueFactory(new PropertyValueFactory<Zaj�cia, String>("Przedmiot"));
		placeColumn.setCellValueFactory(new PropertyValueFactory<Budynek, String>("Budynek"));
		tbl.setItems(null);
		refreshTable();
	}
	
	public void refreshTable() throws JAXBException {

		JAXBLogic.readFromXML();
		tbl.setItems(
				FXCollections.observableArrayList(JAXBLogic.zbi�rPlan�wZaj��.getPlan().getDzie�()));
	}
	
	@FXML
	public void backBtnOnClick() throws IOException {
		Main.showMainWindow();
	}

}
