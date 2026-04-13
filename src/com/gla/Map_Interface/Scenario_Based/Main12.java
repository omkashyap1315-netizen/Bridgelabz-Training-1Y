package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();

        map.put("Laptop", 40000.0);
        map.put("Mouse", 500.0);
        map.put("Keyboard", 1500.0);
        map.put("Headphones", 2000.0);

        System.out.println("Products in cart:");
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        double total = 0;
        for (double price : map.values()) {
            total += price;
        }

        if (total > 5000) {
            total = total - (total * 0.10);
        }

        System.out.println("Total bill: " + total);

        map.remove("Mouse");

        System.out.println("Updated cart:");
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
