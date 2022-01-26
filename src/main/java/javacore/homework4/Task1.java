package src.main.java.javacore.homework4;

import java.util.*;
import java.util.stream.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Mandarin");
        list.add("Banana");
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Orange");
        list.add("Orange");

        Map<String, Long> counted = list.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(counted);
    }
}
