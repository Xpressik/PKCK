package view;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import classes.from.xsd.DefinicjaProwadzacego;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import logic.JAXBLogic;
import main.Main;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class TeachersController {

	@FXML
	TableView<DefinicjaProwadzacego> table;
	@FXML
	TableColumn<DefinicjaProwadzacego, String> titleColumn;
	@FXML
	TableColumn<DefinicjaProwadzacego, String> nameColumn;
	@FXML
	TableColumn<DefinicjaProwadzacego, String> surnameColumn;
	@FXML
	TableColumn<DefinicjaProwadzacego, String> idColumn;
	@FXML
	Button backBtn;

	@FXML
	void initialize() throws JAXBException {
		titleColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadzacego, String>("Stopien"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadzacego, String>("Imie"));
		surnameColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadzacego, String>("Nazwisko"));
		idColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadzacego, String>("Identyfikator"));
		table.setItems(null);
		try {
			refreshList();
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

	public void refreshList() throws JAXBException, FileNotFoundException {
		JAXBLogic.readFromXML();
		table.setItems(FXCollections
				.observableArrayList(JAXBLogic.zbiorPlanowZajec.getListaProwadzacych().getDefinicjaProwadzacego()));
	}
}
