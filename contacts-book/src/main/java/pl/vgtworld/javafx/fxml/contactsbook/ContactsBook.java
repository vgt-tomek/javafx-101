package pl.vgtworld.javafx.fxml.contactsbook;

import com.airhacks.afterburner.injection.Injector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.vgtworld.javafx.fxml.contactsbook.gui.main.MainView;

public class ContactsBook extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		MainView applicationView = new MainView();
		Scene scene = new Scene(applicationView.getView(), 800, 600);
		primaryStage.setTitle("Contacts Book");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		Injector.forgetAll();
	}

}
