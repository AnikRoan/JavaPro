package com.roananik.lessons05Task02.phonebook;

import java.util.ArrayList;
import java.util.List;

public class ContactRecord implements Contact {
    private final String name;
    private List<String> phoneNumber;


    public ContactRecord(String name) {
        phoneNumber = new ArrayList<>();
        this.name = name;

    }
    @Override
    public void addPhoneNumber(String string) {
        phoneNumber.add(string);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' + " " +
                "phoneNumber: " + phoneNumber + "\n";
    }
}
