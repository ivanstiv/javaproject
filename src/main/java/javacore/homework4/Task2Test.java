package src.main.java.javacore.homework4;

import src.main.java.javacore.homework4.Task2;

public class Task2Test {
    public static void main(String[] args) {
        Task2 contacts = new Task2();
        contacts.add("Ivanov", "79001002030");
        contacts.add("Ivanov", "79001002040");
        contacts.add("Petrov", "79001002030");

        System.out.println(contacts.get("Ivanov"));
        System.out.println(contacts.get("Petrov"));
    }
}
