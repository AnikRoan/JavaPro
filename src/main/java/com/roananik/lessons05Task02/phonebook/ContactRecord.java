package com.roananik.lessons05Task02.phonebook;

public class ContactRecord implements Contact {
    private String name;


    private String phoneNumber;

    public ContactRecord(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return "name: '" + name + '\'' +" "+
                "phoneNumber: " + phoneNumber+"\n";
    }
}
