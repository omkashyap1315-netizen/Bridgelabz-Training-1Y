package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main13 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "HR");
        map.put(102, "IT");
        map.put(103, "HR");
        map.put(104, "Finance");
        map.put(105, "IT");

        map.put(102, "Finance");

        String dept = "HR";
        System.out.println("Employees in " + dept + ":");
        for (Integer id : map.keySet()) {
            if (map.get(id).equals(dept)) {
                System.out.println(id);
            }
        }

        HashMap<String, Integer> countMap = new HashMap<>();

        for (String d : map.values()) {
            if (countMap.containsKey(d)) {
                countMap.put(d, countMap.get(d) + 1);
            } else {
                countMap.put(d, 1);
            }
        }

        System.out.println("Employees per department:");
        for (String key : countMap.keySet()) {
            System.out.println(key + " " + countMap.get(key));
        }
    }
}
