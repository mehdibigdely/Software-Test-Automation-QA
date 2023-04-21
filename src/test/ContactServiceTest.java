package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import snhu_gss_mahdiB.Contact;
import snhu_gss_mahdiB.ContactService;

class ContactServiceTest {

	Contact contact = new Contact("ABCDE", "FirstN", "LastN", "1000000001", "14141 Overland Park");
	Contact contact1 = new Contact("ABCDEFG67", "FirstN", "LastN", "1000000001", "14141 Overland Park");
	Contact contactSameId = new Contact("ABCDE", "FirstN", "LastN", "6000000006", "14141 Overland Park");
	ContactService contactService = new ContactService();

	//Checks addition of ONE single contact
	@Test
	void testContactServiceAddSingleContact() {
		assertEquals(true, contactService.addContact(contact));

	}
 
	//Checks addition of one or more (multiple) contact(s)
	@Test
	void testContactServiceAddMultipleContacts() {
		contactService.addContact(contact);
		assertEquals(true, contactService.addContact(contact1));

	}

	//Checks for exception/error message when trying to add a new contact with an existing/duplicate ID 
	@Test
	void testContactServiceDuplicateId() {
		contactService.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contactSameId);
		});

	}

	//Check updating of the first name
	@Test
	void testContactServiceUdpdateFirstName() {
		contactService.addContact(contact);
		assertEquals(true, contactService.updateContactFirstName("ABCDE", "UpdatedFn"));

	}

	//Check updating of the last name
	@Test
	void testContactServiceUpdateLastName() {
		contactService.addContact(contact);
		assertEquals(true, contactService.updateContactLastName("ABCDE", "UpdatedLn"));
	}

	//Check updating of the phone number
	@Test
	void testContactServiceUpdateNumber() {
		contactService.addContact(contact);
		assertEquals(true, contactService.updateContactNumber("ABCDE", "2000000002"));
	}

	//Check updating of the address
	@Test
	void testContactServiceUpdateAddress() {
		contactService.addContact(contact);
		assertEquals(true, contactService.updateContactAddress("ABCDE", "Updated_Address"));
	}

	//Check removing/deletion of an existing contact
	@Test
	void testContactServiceDeleteContact() {
		contactService.addContact(contact);
		assertEquals(true, contactService.deleteContact("ABCDE"));

	}

}
