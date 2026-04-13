package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Milk", 8);

        int buyQty = 5;
        String product = "Banana";

        if (map.containsKey(product)) {
            int qty = map.get(product) - buyQty;
            if (qty <= 0) {
                map.put(product, 0);
            } else {
                map.put(product, qty);
            }
        }

        map.put("Milk", map.get("Milk") + 10);

        String query = "Apple";
        if (map.containsKey(query)) {
            System.out.println(query + " " + map.get(query));
        } else {
            System.out.println("not stocked");
        }

        System.out.println("Out of stock:");
        for (String key : map.keySet()) {
            if (map.get(key) == 0) {
                System.out.println(key);
            }
        }
    }
}
