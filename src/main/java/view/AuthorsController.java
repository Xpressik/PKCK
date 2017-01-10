package view;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import classes.from.xsd.Autor;
import classes.from.xsd.ZbiorPlanowZajec;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import logic.JAXBLogic;
import main.Main;
import javafx.scene.control.Label;

public class AuthorsController {

	@FXML
	private Button button;

	@FXML
	private TableView<Autor> tableView;

	@FXML
	TableColumn<Autor, String> columnNazwisko;

	@FXML
	TableColumn<Autor, String> columnNrIndeksu;

	@FXML
	TableColumn<Autor, String> columnImie;

	@FXML
	Label errorLbl;

	@FXML
	void initialize() throws JAXBException {
		columnImie.setCellValueFactory(new PropertyValueFactory<Autor, String>("Imiê"));
		columnNazwisko.setCellValueFactory(new PropertyValueFactory<Autor, String>("Nazwisko"));
		columnNrIndeksu.setCellValueFactory(new PropertyValueFactory<Autor, String>("Index"));
		tableView.setItems(null);
		
		try {
			odswiezListe();
		} catch (FileNotFoundException e) {
			Alert info = new Alert(AlertType.ERROR);
			info.setTitle("Plik nie istnieje");
			info.setHeaderText("Plik nie istnieje");
			info.setContentText(e.getMessage());
			info.showAndWait();
		}

	}

	@FXML
	public void buttonOnClick() throws JAXBException, IOException {
		Main.showAddAuthorsWindow();
	}

	public void odswiezListe() throws JAXBException, FileNotFoundException{

		JAXBLogic.readFromXML();
		tableView.setItems(
				FXCollections.observableArrayList(JAXBLogic.zbiorPlanowZajec.getNaglowek().getAutorzy().getAutor()));
	}

	@FXML
	public void backBtnOnClick() throws IOException {
		Main.showMainWindow();
	}

	@FXML
	public void editBtnOnClick() throws IOException {
		if ((Main.selectedAuthor = tableView.getSelectionModel().getSelectedItem()) != null) {
			Main.showEditAuthorWindow();
		} else {
			errorLbl.setVisible(true);
		}
	}

	@FXML
	public void deleteAuthorBtnOnClick() throws JAXBException, IOException {
		Autor a;
		if ((a = tableView.getSelectionModel().getSelectedItem()) != null) {
			JAXBLogic.zbiorPlanowZajec.getNaglowek().getAutorzy().getAutor().remove(a);
			JAXBLogic.saveToXML();
			Main.showAuthorsWindow();
		} else {
			errorLbl.setVisible(true);
		}
	}

}
