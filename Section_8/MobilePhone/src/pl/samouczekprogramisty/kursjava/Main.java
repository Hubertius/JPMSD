package pl.samouczekprogramisty.kursjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MobilePhone mobilePhone = new MobilePhone("Anna");
        Contact firstContact = new Contact("Mark", "4878443913");
        Contact secondContact = new Contact("Adam", "4878443914");
        Contact thirdContact = new Contact("Georg", "4878443915");
        mobilePhone.addNewContact(firstContact);
        mobilePhone.addNewContact(secondContact);
        mobilePhone.addNewContact(thirdContact);
        mobilePhone.printContacts();
        System.out.println();
        mobilePhone.removeContact(secondContact);
        System.out.println();
        mobilePhone.printContacts();
        mobilePhone.updateContact(firstContact, secondContact);
        System.out.println();
        mobilePhone.printContacts();
    }
}
