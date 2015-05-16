package pl.vgtworld.javafx.fxml.contactsbook.gui.contactform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import pl.vgtworld.javafx.fxml.contactsbook.entities.Contact;
import pl.vgtworld.javafx.fxml.contactsbook.gui.main.MainController;
import pl.vgtworld.javafx.fxml.contactsbook.seervices.contacts.ContactsService;

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

	private ContactsService contactsService;

	public void init(MainController mainController, ContactsService contactsService) {
		this.mainController = mainController;
		this.contactsService = contactsService;
	}

	public void cancelContactCreation(ActionEvent actionEvent) {
		mainController.displayListOfContacts();
	}

	public void saveContact(ActionEvent actionEvent) {
		Contact newContact = new Contact();
		newContact.setFirstName(firstName.getText());
		newContact.setLastName(lastName.getText());
		newContact.setEmail(emailAddress.getText());
		newContact.setNotes(notes.getText());
		contactsService.createNewContact(newContact);
		mainController.displayListOfContacts();
	}
}
