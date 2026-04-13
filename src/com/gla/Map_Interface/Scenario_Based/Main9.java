package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Alice", 50000.0);
        map.put("Bob", 60000.0);
        map.put("Carol", 55000.0);
        map.put("David", 70000.0);
        map.put("Eve", 65000.0);
        map.put("Frank", 70000.0);

        String name = "Alice";
        double percent = 10;

        if (map.containsKey(name)) {
            double salary = map.get(name);
            salary = salary + (salary * percent / 100);
            map.put(name, salary);
        } else {
            System.out.println("Employee not found");
        }

        double sum = 0;
        for (double value : map.values()) {
            sum += value;
        }
        double avg = sum / map.size();
        System.out.println("Average salary: " + avg);

        double max = 0;
        for (double value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Highest paid employees:");
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
