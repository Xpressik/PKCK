package view;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import classes.from.xsd.DefinicjaProwadz¹cego;
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
	TableView<DefinicjaProwadz¹cego> table;
	@FXML
	TableColumn<DefinicjaProwadz¹cego, String> titleColumn;
	@FXML
	TableColumn<DefinicjaProwadz¹cego, String> nameColumn;
	@FXML
	TableColumn<DefinicjaProwadz¹cego, String> surnameColumn;
	@FXML
	TableColumn<DefinicjaProwadz¹cego, String> idColumn;
	@FXML
	Button backBtn;

	@FXML
	void initialize() throws JAXBException {
		titleColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadz¹cego, String>("Stopieñ"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadz¹cego, String>("Imiê"));
		surnameColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadz¹cego, String>("Nazwisko"));
		idColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadz¹cego, String>("Identyfikator"));
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
				.observableArrayList(JAXBLogic.zbiórPlanówZajêæ.getListaProwadz¹cych().getDefinicjaProwadz¹cego()));
	}
}
