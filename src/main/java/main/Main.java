package main;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import classes.from.xsd.Autor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.EditAuthorController;
import view.FrameController;

public class Main extends Application{

	private Stage stage;
	private static BorderPane mainFrame;
	
	public static Autor selectedAuthor;
		
	public static void main(String[] args) throws JAXBException {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		stage = primaryStage;
		stage.setResizable(false);
		stage.setTitle("Autorzy");
		showMainFrame();
		showMainWindow();
	}
	
	public void showMainFrame() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../fxml/Frame.fxml"));
		mainFrame = loader.load();
		Scene scene = new Scene(mainFrame);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void showAuthorsWindow() throws IOException, JAXBException
	{
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(Main.class.getResource("/fxml/AuthorsWindow.fxml"));
		FrameController.anchorPane = fxmlLoader.load();
		mainFrame.setBottom(FrameController.anchorPane);
	}
	
	public static void showAddAuthorsWindow() throws IOException{
		
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(Main.class.getResource("/fxml/AddAuthorWindow.fxml"));
		FrameController.anchorPane = fxmlLoader.load();
		mainFrame.setBottom(FrameController.anchorPane);
	}
	
	public static void showTeachersWindow() throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(Main.class.getResource("/fxml/TeachersWindow.fxml"));
		FrameController.anchorPane = fxmlLoader.load();
		mainFrame.setBottom(FrameController.anchorPane);
	}
	
	public static void showMainWindow() throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(Main.class.getResource("/fxml/MainWindow.fxml"));
		FrameController.anchorPane = fxmlLoader.load();
		mainFrame.setBottom(FrameController.anchorPane);
	}
	
	public static void showEditAuthorWindow() throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(Main.class.getResource("/fxml/EditAuthorWindow.fxml"));
		FrameController.anchorPane = fxmlLoader.load(); 
		mainFrame.setBottom(FrameController.anchorPane);
	}
	
	public static void showTimetableWindow() throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(Main.class.getResource("/fxml/TimetableWindow.fxml"));
		FrameController.anchorPane = fxmlLoader.load(); 
		mainFrame.setBottom(FrameController.anchorPane);
	}
}
