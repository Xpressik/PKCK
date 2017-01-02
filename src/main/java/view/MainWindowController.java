package view;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import main.Main;

public class MainWindowController {

	@FXML
	public void authorsBtnOnClick() throws JAXBException, IOException {
		Main.showAuthorsWindow();

	}

	@FXML
	public void teachersBtnOnClick() throws IOException {
		Main.showTeachersWindow();
	}

	@FXML
	public void timetableBtnOnClick() throws IOException {
		Main.showTimetableWindow();
	}

	@FXML
	public void quitBtnOnClick() {
		Platform.exit();
		System.exit(0);
	}

}
