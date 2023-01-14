package oop;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    HashMap<String, String> phones = new HashMap<>();


    public void addPhone(String name, String phone) {
        phones.put(name, phone);
    }

    public void printPhones() {
        for (Map.Entry<String, String> contact : phones.entrySet()) {
            System.out.printf("Имя: %s, телефон: %s %n", contact.getKey(), contact.getValue());
        }
    }

}
