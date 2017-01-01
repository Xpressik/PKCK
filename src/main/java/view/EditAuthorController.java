package view;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import classes.from.xsd.Autor;
import classes.from.xsd.ZbiórPlanówZajêæ;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import logic.JAXBLogic;
import main.Main;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EditAuthorController {

	@FXML
	TextField nameTextField;
	@FXML
    TextField surnameTextField;
	@FXML
	TextField indeksTextField;
	@FXML Button saveBtn;
	@FXML Label errorLbl;

	@FXML
	void initialize() {

		nameTextField.getText();
		nameTextField.setText(Main.selectedAuthor.getImiê());
		surnameTextField.getText();
		surnameTextField.setText(Main.selectedAuthor.getNazwisko());
		indeksTextField.getText();
		indeksTextField.setText(Long.toString(Main.selectedAuthor.getIndex()));
	}
	
	@FXML
	public void saveBtnOnClick() throws JAXBException, IOException {
		try{
			Long number =  Long.parseLong(indeksTextField.getText());
			List<Autor> list = JAXBLogic.zbiórPlanówZajêæ.getNag³ówek().getAutorzy().getAutor();
			Autor author = new Autor();
			author.setImiê(nameTextField.getText());
			author.setNazwisko(surnameTextField.getText());
			author.setIndex(number);
			list.set(list.indexOf(Main.selectedAuthor), author);
			JAXBLogic.saveToXML();
			errorLbl.setVisible(false);
			backBtnOnClick();
		}
		catch(NumberFormatException e){
			errorLbl.setVisible(true);
		}		
	}

	@FXML
	public void backBtnOnClick() throws IOException, JAXBException {
		Main.showAuthorsWindow();
	}
}
