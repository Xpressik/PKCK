package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import main.Main;

public class FrameController implements Initializable {

	@FXML
	MenuItem close;
	@FXML
	MenuItem about;
	private Alert info;
	@FXML
	public static AnchorPane anchorPane;
	@FXML
	MenuItem xmlPath;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void applyCloseBtn() {
		Platform.exit();
		System.exit(0);
	}

	public void applyAboutBtn() {
		info = new Alert(AlertType.INFORMATION);
		info.setTitle("O programie");
		info.setHeaderText("Zadanie 5 PKCK.");
		info.setContentText("Autorzy: Dawid Dziedziczak, Micha³ Mackiewicz");
		info.showAndWait();
	}

	@FXML
	public void xmlFilePathOnClick() {	
		Main.showFileChooser();
	}

}
