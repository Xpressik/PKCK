package view;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import classes.from.xsd.Autor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import logic.JAXBLogic;
import main.Main;

public class AddAuthorController {

	@FXML
	TextField imieTextField;
	@FXML
	TextField nazwiskoTextField;
	@FXML
	TextField indeksTextField;
	@FXML
	Button dodajAutoraBtn;
	@FXML
	Button backBtn;
	@FXML Label errorLbl;

	@FXML
	void initialize() {

	}

	@FXML
	void dodajAutoraOnClick() throws JAXBException, IOException {

		if( !imieTextField.getText().isEmpty() && !nazwiskoTextField.getText().isEmpty() && !indeksTextField.getText().isEmpty()){
			Autor autor = new Autor();
			autor.setImiê(imieTextField.getText());
			autor.setNazwisko(nazwiskoTextField.getText());
			autor.setIndex(Long.parseLong(indeksTextField.getText()));
			JAXBLogic.zbiórPlanówZajêæ.getNag³ówek().getAutorzy().getAutor().add(autor);
			JAXBLogic.saveToXML();
			backBtnOnClick();
		}
		else{
			errorLbl.setVisible(true);
		}
			
	}

	@FXML
	public void backBtnOnClick() throws IOException, JAXBException {
		Main.showAuthorsWindow();
	}
}
