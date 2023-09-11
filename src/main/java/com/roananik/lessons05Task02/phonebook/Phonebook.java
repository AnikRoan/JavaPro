package com.roananik.lessons05Task02.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> phoneBook;

    public Phonebook() {
        this.phoneBook = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        phoneBook.add(contact);
    }

    public Contact find(String name) {
        for (Contact contact : phoneBook) {
            if (name.equalsIgnoreCase(contact.getName())) {
                return contact;
            }
        }
        return null;

    }

    public List<Contact> findAll(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : phoneBook) {
            if (name.equalsIgnoreCase(contact.getName())) {

                result.add(contact);
            }

        }
        return result.isEmpty() ? null : result;

    }

    @Override
    public String toString() {
        return "Phonebook\n" +
                phoneBook;
    }
}
