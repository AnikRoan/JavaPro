package com.roananik.lessons05Task02.phonebook;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Contact contact1 = new ContactRecord("Vova");
        contact1.addPhoneNumber("345632211");
        contact1.addPhoneNumber("555887665");
        Contact contact2 = new ContactRecord("Kolja");
        contact2.addPhoneNumber("8888888888");
        Contact contact3 = new ContactRecord("Vova");
        contact3.addPhoneNumber("0000000000000");
        Contact contact4 = new ContactRecord("Sasha");
        contact4.addPhoneNumber("9999999999999");
        Contact contact5 = new ContactRecord("Masha");
        contact5.addPhoneNumber("3333333333333");
        Contact contact6 = new ContactRecord("Olga");
        Contact contact7 = new ContactRecord("Alla");


        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);
        phonebook.addContact(contact4);
        phonebook.addContact(contact5);
        phonebook.addContact(contact6);
        phonebook.addContact(contact7);
        Contact b = phonebook.find("Vova");
        System.out.println(b);
        Contact c = phonebook.find("Olga");
        System.out.println(c);
        List<Contact> findVova = phonebook.findAll("Vova");
        System.out.println(findVova);
         System.out.println(phonebook);
    }
}
