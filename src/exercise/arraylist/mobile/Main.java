package exercise.arraylist.mobile;

public class Main {

	public static void main(String[] args) {
		MobilePhone mobile = new MobilePhone("987653536");
		mobile.addNewContact(new Contact("John", "+93849384394"));
		mobile.addNewContact(new Contact("Mike", "+13849384394"));
		mobile.updateContact(new Contact("John", "+93849384394"), new Contact("Aadi", "+398394833434"));
		mobile.printContacts();
		mobile.removeContact(new Contact("Aadi", "+93849384394"));
		mobile.printContacts();

	}

}
