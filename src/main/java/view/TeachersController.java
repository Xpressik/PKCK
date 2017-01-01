package view;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import classes.from.xsd.DefinicjaProwadzącego;
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
	TableView<DefinicjaProwadzącego> table;
	@FXML
	TableColumn<DefinicjaProwadzącego, String> titleColumn;
	@FXML
	TableColumn<DefinicjaProwadzącego, String> nameColumn;
	@FXML
	TableColumn<DefinicjaProwadzącego, String> surnameColumn;
	@FXML
	TableColumn<DefinicjaProwadzącego, String> idColumn;
	@FXML
	Button backBtn;

	@FXML
	void initialize() throws JAXBException {
		titleColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadzącego, String>("Stopień"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadzącego, String>("Imię"));
		surnameColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadzącego, String>("Nazwisko"));
		idColumn.setCellValueFactory(new PropertyValueFactory<DefinicjaProwadzącego, String>("Identyfikator"));
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
				.observableArrayList(JAXBLogic.zbiórPlanówZajęć.getListaProwadzących().getDefinicjaProwadzącego()));
	}
}
