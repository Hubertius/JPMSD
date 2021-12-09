package pl.samouczekprogramisty.kursjava;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        if(findContact(newContact.getName()) >= 0) {
            return false;
        }
        if(myContacts.contains(newContact)) {
            return false;
        }
        myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact updateContact) {
        if(myContacts.contains(oldContact)) {
            myContacts.set(myContacts.indexOf(oldContact), updateContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact removeContact) {
        return myContacts.remove(removeContact);
    }

    public int findContact(Contact findContact) {
        return myContacts.indexOf(findContact);
    }

    public int findContact(String name) {
        for(Contact contact: this.myContacts) {
            if(contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int indexOfFind = findContact(name);
        if(indexOfFind >= 0) {
            return myContacts.get(indexOfFind);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(Contact contact: this.myContacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
