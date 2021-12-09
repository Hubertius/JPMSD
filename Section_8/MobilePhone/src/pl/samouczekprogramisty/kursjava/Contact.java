package pl.samouczekprogramisty.kursjava;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public int hashCode() {
        return 31 * this.getPhoneNumber().hashCode() + 7 * this.getName().hashCode();
    }

    @Override
    public boolean equals(Object anotherObject) {
        if(anotherObject == null) {
            return false;
        }
        Contact anotherContact = (Contact) anotherObject;
        if(anotherContact.name == null || anotherContact.phoneNumber == null) {
            return false;
        }
        if(this.name.equals(anotherContact.name) && this.phoneNumber.equals(anotherContact.phoneNumber)) {
            return true;
        }
        return false;
    }
}
