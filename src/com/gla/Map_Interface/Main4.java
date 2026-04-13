package com.gla.Map_Interface;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        for (String key : map2.keySet()) {
            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + map2.get(key));
            } else {
                map1.put(key, map2.get(key));
            }
        }

        System.out.println(map1);
    }
}