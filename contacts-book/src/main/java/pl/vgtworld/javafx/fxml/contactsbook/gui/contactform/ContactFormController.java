package pl.vgtworld.javafx.fxml.contactsbook.gui.contactform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import pl.vgtworld.javafx.fxml.contactsbook.gui.main.MainController;

public class ContactFormController {

	@FXML
	private TextField firstName;

	@FXML
	private TextField lastName;

	@FXML
	private TextField emailAddress;

	@FXML
	private TextArea notes;

	private MainController mainController;

	public void init(MainController mainController) {
		this.mainController = mainController;
	}

	public void cancelContactCreation(ActionEvent actionEvent) {
		mainController.displayListOfContacts();
	}

}
