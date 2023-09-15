package com.roananik.lessons05Task02.phonebook;

import java.util.List;

public interface Contact {
    void addPhoneNumber(String string);

    String getName();

    List<String> getPhoneNumber();
}
