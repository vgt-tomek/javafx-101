package pl.vgtworld.javafx.fxml.contactsbook.gui.contactform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import pl.vgtworld.javafx.fxml.contactsbook.gui.main.MainPresenter;

public class ContactformPresenter {

	@FXML
	private TextField firstName;

	@FXML
	private TextField lastName;

	@FXML
	private TextField emailAddress;

	@FXML
	private TextArea notes;

	private MainPresenter mainPresenter;

	public void setMainPresenter(MainPresenter mainPresenter) {
		this.mainPresenter = mainPresenter;
	}

	public void cancelContactCreation(ActionEvent actionEvent) {
		mainPresenter.displayListOfContacts();
	}

}
