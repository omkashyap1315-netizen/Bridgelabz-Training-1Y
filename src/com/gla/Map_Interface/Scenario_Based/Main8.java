package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("CS101", 45);
        map.put("CS102", 52);
        map.put("CS103", 3);
        map.put("CS104", 60);
        map.put("CS105", 2);

        String courseAdd = "CS101";
        map.put(courseAdd, map.get(courseAdd) + 5);

        String courseDrop = "CS103";
        int value = map.get(courseDrop) - 2;
        if (value < 0) {
            value = 0;
        }
        map.put(courseDrop, value);

        System.out.println("Near full courses:");
        for (String key : map.keySet()) {
            if (map.get(key) >= 50) {
                System.out.println(key + " " + map.get(key));
            }
        }

        System.out.println("Under-subscribed courses:");
        for (String key : map.keySet()) {
            if (map.get(key) < 5) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
