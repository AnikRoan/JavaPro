package com.roananik.lessons05Task02.phonebook;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Contact vovaContact = new ContactRecord("Vova");
        vovaContact.addPhoneNumber("345632211");
        vovaContact.addPhoneNumber("555887665");
        Contact koljaContact = new ContactRecord("Kolja");
        koljaContact.addPhoneNumber("8888888888");
        Contact secondVovaContact = new ContactRecord("Vova");
        secondVovaContact.addPhoneNumber("0000000000000");
        Contact sashaContact = new ContactRecord("Sasha");
        sashaContact.addPhoneNumber("9999999999999");
        Contact mashaContact = new ContactRecord("Masha");
        mashaContact.addPhoneNumber("3333333333333");
        Contact olgaContact = new ContactRecord("Olga");
        Contact allaContact = new ContactRecord("Alla");


        phonebook.addContact(vovaContact);
        phonebook.addContact(koljaContact);
        phonebook.addContact(secondVovaContact);
        phonebook.addContact(sashaContact);
        phonebook.addContact(mashaContact);
        phonebook.addContact(olgaContact);
        phonebook.addContact(allaContact);
        Contact vova = phonebook.find("Vova");
        System.out.println(vova);
        Contact olga = phonebook.find("Olga");
        System.out.println(olga);
        List<Contact> findAllVova = phonebook.findAll("Vova");
        System.out.println(findAllVova);
        System.out.println(phonebook);
    }
}
