package src.main.java.javacore.homework4;

import java.util.*;

public class Task2 {

    HashMap<String, HashSet<String>> contacts = new HashMap<>();

    public void add(String lastName, String phone) {
        HashSet<String> array;

        if (contacts.containsKey(lastName)) {
            array = contacts.get(lastName);
        } else {
            array = new HashSet<>();
        }

        array.add(phone);
        contacts.put(lastName, array);
    }

    public Set<String> get(String lastName) {
        return contacts.get(lastName);
    }
}
