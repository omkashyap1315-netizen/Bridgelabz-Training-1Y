package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("978-1111111111", "Java Basics");
        map.put("978-2222222222", "Data Structures");
        map.put("978-3333333333", "Algorithms");

        String searchISBN = "978-2222222222";
        if (map.containsKey(searchISBN)) {
            System.out.println(map.get(searchISBN));
        } else {
            System.out.println("Book not found");
        }

        map.remove("978-3333333333");

        TreeMap<String, String> sortedMap = new TreeMap<>(map);
        for (String key : sortedMap.keySet()) {
            System.out.println(key + " " + sortedMap.get(key));
        }

        String searchTitle = "Java Basics";
        boolean found = false;

        for (String key : map.keySet()) {
            if (map.get(key).equals(searchTitle)) {
                System.out.println("Found ISBN: " + key);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }
}