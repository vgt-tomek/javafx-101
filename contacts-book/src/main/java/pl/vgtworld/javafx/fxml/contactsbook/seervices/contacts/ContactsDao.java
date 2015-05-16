package pl.vgtworld.javafx.fxml.contactsbook.seervices.contacts;

import pl.vgtworld.javafx.fxml.contactsbook.entities.Contact;

import java.util.HashMap;
import java.util.Map;

class ContactsDao {

	private static int keyAutoincrement = 0;

	private Map<Integer, Contact> contacts = new HashMap<>();

	synchronized int add(Contact contact) {
		int nextKey = ++keyAutoincrement;
		contacts.put(nextKey, contact);
		return nextKey;
	}

}
