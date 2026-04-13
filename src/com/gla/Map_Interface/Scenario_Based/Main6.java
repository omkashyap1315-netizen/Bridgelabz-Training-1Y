package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 0);
        map.put("Bob", 0);
        map.put("Carol", 0);
        map.put("David", 0);
        map.put("Eve", 0);

        String[][] attendance = {
                {"Alice", "Bob"},
                {"Alice", "Carol"},
                {"Bob", "David"},
                {"Alice", "Eve"},
                {"Bob", "Carol"},
                {"Alice", "Bob", "David"},
                {"Eve"},
                {"Alice", "Carol"},
                {"Bob", "Eve"},
                {"Alice", "David"},
                {"Carol"},
                {"Alice", "Bob"},
                {"David", "Eve"},
                {"Alice"},
                {"Bob", "Carol"}
        };

        for (int i = 0; i < attendance.length; i++) {
            for (String name : attendance[i]) {
                map.put(name, map.get(name) + 1);
            }
        }

        int threshold = 10;

        System.out.println("Students with low attendance:");
        for (String key : map.keySet()) {
            if (map.get(key) < threshold) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
