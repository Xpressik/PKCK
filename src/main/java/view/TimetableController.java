package view;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import classes.from.xsd.Autor;
import classes.from.xsd.Budynek;
import classes.from.xsd.Czas;
import classes.from.xsd.Dzieñ;
import classes.from.xsd.Prowadz¹cy;
import classes.from.xsd.Zajêcia;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import logic.JAXBLogic;
import main.Main;

public class TimetableController {

	@FXML
	TableView<Dzieñ> tbl;
	@FXML
	TableColumn<Zajêcia, String> column1;
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
	TableColumn<List<Prowadz¹cy>, String> teacherColumn;
	@FXML
	TableColumn<Zajêcia, String> subjectColumn;
	@FXML
	TableColumn<Budynek, String> placeColumn;
	
	@FXML
	void initialize() throws JAXBException{
		column1.setCellValueFactory(new PropertyValueFactory<Zajêcia, String>("Zajêcia"));
		timeColumn.setCellValueFactory(new PropertyValueFactory<Czas, String>("Czas"));
		teacherColumn.setCellValueFactory(new PropertyValueFactory<List<Prowadz¹cy>, String>("Prowadz¹cy"));
		subjectColumn.setCellValueFactory(new PropertyValueFactory<Zajêcia, String>("Przedmiot"));
		placeColumn.setCellValueFactory(new PropertyValueFactory<Budynek, String>("Budynek"));
		tbl.setItems(null);
		refreshTable();
	}
	
	public void refreshTable() throws JAXBException {

		JAXBLogic.readFromXML();
		tbl.setItems(
				FXCollections.observableArrayList(JAXBLogic.zbiórPlanówZajêæ.getPlan().getDzieñ()));
	}
	
	@FXML
	public void backBtnOnClick() throws IOException {
		Main.showMainWindow();
	}

}
