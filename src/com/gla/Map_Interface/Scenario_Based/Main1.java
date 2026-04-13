package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Alice", 85.5);
        map.put("Bob", 90.0);
        map.put("Carol", 78.0);

        map.put("Alice", 88.0);

        map.remove("Carol");

        TreeMap<String, Double> sortedMap = new TreeMap<>(map);

        for (String name : sortedMap.keySet()) {
            System.out.println(name + " " + sortedMap.get(name));
        }
    }
}
