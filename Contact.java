package snhu_gss_mahdiB;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String contact;
	
	//checks contact identification (ID) to be 10 characters or less, and cannot be left empty; otherwise throws exception error message
	//sets provided value if ID check is passed
	public Contact(String contactId, String firstN, String lastN, String phoneN, String address){
		if (contactId == null || contactId.length() >= 10) {
			throw new IllegalArgumentException("Problem! either the provided ID is more than 10 characters or is left empty.");
		}
		else {
		this.contact = contactId;
		this.setFirstName(firstN);
		this.setLastName(lastN);
		this.setPhoneNumber(phoneN);
		this.setAddress(address);
		}
	}
	
	//checks phone number to be exactly 10 characters, and cannot be left empty; otherwise throws exception error message
	//sets provided value if phone number check is passed
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Problem! phone number should be 10 digits and cannot be left empty.");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
	}

	//the same process as explained in above lines (lines 26 and 27)
	public void setFirstName(String fName) {
		if(fName == null || fName.length() >= 10) {
			throw new IllegalArgumentException("Problem! either the provided first name is more than 10 characters or is left empty.");
		}
		else {
			this.firstName = fName;
		}
	}
	
	//the same process as explained in above lines (lines 26 and 27)
	public void setLastName(String lName) {
		if (lName == null || lName.length() >= 10) {
			throw new IllegalArgumentException("Problem! either the provided last name is more than 10 characters or is left empty.");
		}
		else {
			this.lastName = lName;
		}
	}

	//the same process as explained in above lines (lines 26 and 27)
	public void setAddress(String address) {
		if( address == null || address.length() >= 30) {
			throw new IllegalArgumentException("Problem! either the provided address is more than 30 characters or is left empty.");
		}
		else {
			this.address = address;
		}
	}
	
	//returns phone no, address, contact, first or last name, based on the given values
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}


	public String getContact() {
		return this.contact;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}


}
