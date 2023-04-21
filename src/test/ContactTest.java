package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import snhu_gss_mahdiB.Contact;

class ContactTest {

	//tests creating of a new contact
	@Test
	void testContactCreated() {
		Contact contact = new Contact("ABCDE", "FirstName", "LastName", "7013205151", "14145 Overland Park");
		assertTrue(contact.getContact().equals("ABCDE"));
		assertTrue(contact.getFirstName().equals("FirstName"));
		assertTrue(contact.getLastName().equals("LastName"));
		assertTrue(contact.getPhoneNumber().equals("7013205151"));
		assertTrue(contact.getAddress().equals("14145 Overland Park"));
	}

	//tests when ID is longer than 10 characters to see if exception error is thrown
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ABCDEFGHIJKLMN", "FirstName", "LastName", "7013205151", "14145 Overland Park");
		});
	}

	//tests to get exception error when ID field is left blank/empty
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "FirstName", "LastName", "7013205151", "14145 Overland Park");
		});
	}

	//tests to get exception error when first name characters are more than 10
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ABCDE", "FirstNameTooLong", "LastName", "7013205151", "14145 Overland Park");
		});
	}

	//tests to get exception error when first name field is left blank/empty
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ABCDE", null, "LastName", "7013205151", "14145 Overland Park");
		});
	}

	//tests to get exception error when address characters are too long (more than 30)
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ABCDE", "FirstName", "LastName", "7013205151",
					"Address should be 30 characters or smaller and can not be blank/empty; if it is, an exception should be thrown as in this example.");
		});
	}

	//tests to get exception error when address field is left blank/empty
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ABCDE", "Testing", "Contact", "7013205151", null);
		});
	}

	//tests to make sure phone number digits are exactly 10 characters, an exception should be thrown as in this example
	@Test
	void testPhoneNumberDigitCount() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("ABCDE", "Testing", "Contact", "751515151515151", "14145 Overland Park");
		});

	}

}
