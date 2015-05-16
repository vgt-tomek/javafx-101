package pl.vgtworld.javafx.fxml.contactsbook.seervices.contacts;

import pl.vgtworld.javafx.fxml.contactsbook.entities.Contact;

public class ContactsService {

	private ContactsDao dao = new ContactsDao();

	public void createNewContact(Contact contact) {
		dao.add(contact);
	}
}
