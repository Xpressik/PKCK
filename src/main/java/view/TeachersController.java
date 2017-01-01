package view;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import classes.from.xsd.DefinicjaProwadz�cego;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import logic.JAXBLogic;
import main.Main;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;

public class TeachersController {

	@FXML
	TableView<DefinicjaProwadz�cego> table;
	@FXML
	TableColumn<DefinicjaProwadz�cego, String> titleColumn;
	@FXML
	TableColumn<DefinicjaProwadz�cego, String> nameColumn;
	@FXML
	TableColumn<DefinicjaProwadz�cego, String> surnameColumn;
	@FXML
	TableColumn<DefinicjaProwadz�cego, String> idColumn;
	@FXML
	Button backBtn;

	@FXML
	void initialize() throws JAXBException {
		titleColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadz�cego, String>("Stopie�"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadz�cego, String>("Imi�"));
		surnameColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadz�cego, String>("Nazwisko"));
		idColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadz�cego, String>("Identyfikator"));
		table.setItems(null);
		refreshList();
	}

	@FXML
	public void backBtnOnClick() throws IOException {
		Main.showMainWindow();
	}

	public void refreshList() throws JAXBException {
		JAXBLogic.readFromXML();
		table.setItems(FXCollections
				.observableArrayList(JAXBLogic.zbi�rPlan�wZaj��.getListaProwadz�cych().getDefinicjaProwadz�cego()));
	}
}
