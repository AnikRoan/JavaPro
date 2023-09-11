package com.roananik.lessons05Task02.phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Contact contact1 = new ContactRecord("Vova", "098833245670");
        Contact contact2 = new ContactRecord("Kolja", "554553325670");
        Contact contact3 = new ContactRecord("Vova", "99893325670");
        Contact contact4 = new ContactRecord("Sasha", "112113325670");
        Contact contact5 = new ContactRecord("Masha", "443663325670");
        Contact contact6 = new ContactRecord("Olga", "37732567099");
        Contact contact7 = new ContactRecord("Alla", "99987763325670");



        phonebook.addContact(contact1);
        phonebook.addContact(contact2);
        phonebook.addContact(contact3);
        phonebook.addContact(contact4);
        phonebook.addContact(contact5);
        phonebook.addContact(contact6);
        phonebook.addContact(contact7);
        phonebook.find("Vova");
        Contact c = phonebook.find("Olga");
        System.out.println(c);
        List<Contact> findVova = phonebook.findAll("Vova");
        System.out.println(findVova);
       // System.out.println(phonebook);
    }
}
