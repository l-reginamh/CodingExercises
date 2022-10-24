package exercise044;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            this.myContacts.add(contact);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index != -1) {
            this.myContacts.set(index, newContact);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeContact(Contact oldContact) {
        int index = findContact(oldContact);
        if (index != -1) {
            this.myContacts.remove(oldContact);
            return true;
        }
        else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        int i = 0;
        for (Contact mycontact : this.myContacts) {
            if (mycontact.getPhoneNumber().equals(contact.getPhoneNumber())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private int findContact(String phoneNumber) {
        int i = 0;
        for (Contact mycontact : this.myContacts) {
            if (mycontact.getPhoneNumber().equals(phoneNumber)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact mycontact : this.myContacts) {
            if (mycontact.getName().equals(name)) {
                return mycontact;
            }
        }
        return null;
    }

    public void printContacts() {
        int i = 1;
        System.out.println("Contact List: ");
        for (Contact mycontact : this.myContacts) {
            System.out.println(i + "." + mycontact.getName() + " -> " + mycontact.getPhoneNumber());
            i++;
        }
    }
}
