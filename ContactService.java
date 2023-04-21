package snhu_gss_mahdiB;
import java.util.ArrayList;

public class ContactService {
	
	//defines and then creates an Array list using Contact class
	ArrayList<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
	}

	//checks the ID and creates a new contact if no duplicate found, otherwise throws an exception error.
	public boolean addContact(Contact newContact) {
		boolean idAlreadyExists = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(newContact.getContact())) {
				idAlreadyExists = true;
				break;
			}
		}

		if (!idAlreadyExists) {
			contacts.add(newContact);
			return true;
		} else {
			throw new IllegalArgumentException("Problem! contact Id that is provided already exist and we cannot use duplicate ID.");
		}
	}

	//searches contacts for the provided ID and deletes the contact if found, otherwise returns false
	public boolean deleteContact(String contactId) {
		boolean contactFoundAndDeleted = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactId)) {
				contacts.remove(contact);
				contactFoundAndDeleted = true;
				//System.out.println("contact ID " + contacts + " was deleted successfully");
				break;
			}
		}
		return contactFoundAndDeleted;
	}

	//searches and updates first name based on provided ID
	public boolean updateContactFirstName(String contactID, String newFirstName) {
		boolean firstNameUpdated = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactID)) {
				contact.setFirstName(newFirstName);
				firstNameUpdated = true;
				break;
			}
		}
		return firstNameUpdated;
	}

	//searches and updates last name based on provided ID
	public boolean updateContactLastName(String contactID, String newLastName) {
		boolean lasttNameUpdated = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactID)) {
				contact.setLastName(newLastName);
				lasttNameUpdated = true;
				break;
			}
		}
		return lasttNameUpdated;
	}

	//searches and updates phone no. based on provided ID
	public boolean updateContactNumber(String contactID, String newNumber) {
		boolean phoneNoUpdated = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactID)) {
				contact.setPhoneNumber(newNumber);
				phoneNoUpdated = true;
				break;
			}
		}
		return phoneNoUpdated;
	}

	//searches and updates address based on provided ID
	public boolean updateContactAddress(String contactID, String newAddress) {
		boolean addressUpdated = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactID)) {
				contact.setAddress(newAddress);
				addressUpdated = true;
				break;
			}
		}
		return addressUpdated;
	}
}