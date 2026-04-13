package com.gla.Map_Interface;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        HashMap<Integer, ArrayList<String>> result = new HashMap<>();

        for (String key : map.keySet()) {
            int value = map.get(key);

            if (!result.containsKey(value)) {
                result.put(value, new ArrayList<>());
            }

            result.get(value).add(key);
        }

        System.out.println(result);
    }
}
