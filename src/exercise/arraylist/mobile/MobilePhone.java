package exercise.arraylist.mobile;

import java.util.ArrayList;

public class MobilePhone {

	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		myContacts = new ArrayList<Contact>();
	}

	public boolean addNewContact(Contact contact) {
		if (findContact(contact) < 0) {
			myContacts.add(contact);
			return true;
		}
		return false;
	}

	private int findContact(Contact contact) {
		int position = 0;
		for (Contact c : myContacts) {
			if (c.getName().contains(contact.getName())) {
				return position;
			}
			position++;
		}
		return -1;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		if (findContact(newContact) >= 0)
			return true;

		int position = findContact(oldContact);
		if (position >= 0) {
			myContacts.set(position, newContact);
			return true;
		}

		return false;
	}

	public void printContacts() {
		System.out.println("Contact List:");
		int position = 0;
		for (Contact c : myContacts) {
			System.out.println((position + 1) + ". " + c.getName() + " -> " + c.getPhoneNumber());
			position++;
		}

	}

	public boolean removeContact(Contact contactToRemove) {
		int position = findContact(contactToRemove);
		if (position >= 0) {
			myContacts.remove(position);
			return true;
		}
		return false;

	}

	private int findContact(String contactName) {
		int position = 0;
		for (Contact c : myContacts) {
			if (c.getName().contains(contactName)) {
				return position;
			}
			position++;
		}
		return -1;
	}

	public Contact queryContact(String name) {
		int position = findContact(name);
		return myContacts.get(position);
	}
}
