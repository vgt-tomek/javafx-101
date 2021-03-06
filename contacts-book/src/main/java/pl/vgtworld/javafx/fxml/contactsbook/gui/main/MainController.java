package pl.vgtworld.javafx.fxml.contactsbook.gui.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import pl.vgtworld.javafx.fxml.contactsbook.gui.contactform.ContactFormController;
import pl.vgtworld.javafx.fxml.contactsbook.seervices.contacts.ContactsService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

	@FXML
	private BorderPane rootPane;

	private ContactsService contactsService = new ContactsService();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void displayNewContactForm() throws IOException {
		FXMLLoader loader = new FXMLLoader(ContactFormController.class.getResource("contactform.fxml"));
		Parent view = loader.load();
		ContactFormController controller = loader.<ContactFormController>getController();
		controller.init(this, contactsService);
		rootPane.setCenter(view);
	}

	public void displayListOfContacts() {
		rootPane.setCenter(null);
		//TODO Display table with contacts.
	}
}
