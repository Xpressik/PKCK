package view;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import classes.from.xsd.Autor;
import classes.from.xsd.ZbiórPlanówZajêæ;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
		odswiezListe();
	}

	@FXML
	public void buttonOnClick() throws JAXBException, IOException {
		Main.showAddAuthorsWindow();
	}

	public void odswiezListe() throws JAXBException {

		JAXBLogic.readFromXML();
		tableView.setItems(
				FXCollections.observableArrayList(JAXBLogic.zbiórPlanówZajêæ.getNag³ówek().getAutorzy().getAutor()));
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
			JAXBLogic.zbiórPlanówZajêæ.getNag³ówek().getAutorzy().getAutor().remove(a);
			JAXBLogic.saveToXML();
			Main.showAuthorsWindow();
		} else {
			errorLbl.setVisible(true);
		}
	}

}
