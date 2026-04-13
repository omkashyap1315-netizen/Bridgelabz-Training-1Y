package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington");
        map.put("UK", "London");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Japan", "Tokyo");
        map.put("China", "Beijing");
        map.put("Canada", "Ottawa");

        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();

        if (map.containsKey(country)) {
            System.out.println(map.get(country));
        } else {
            System.out.println("Unknown country");
        }

        TreeMap<String, String> sortedMap = new TreeMap<>(map);

        for (String key : sortedMap.keySet()) {
            System.out.println(key + " " + sortedMap.get(key));
        }
    }
}
