package pl.vgtworld.javafx.fxml.contactsbook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.vgtworld.javafx.fxml.contactsbook.gui.main.MainController;

public class ContactsBook extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(MainController.class.getResource("main.fxml"));
		Parent view = loader.load();
		Scene scene = new Scene(view, 800, 600);
		primaryStage.setTitle("Contacts Book");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
