package com.gla.Map_Interface;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            int value = map.get(key);

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        System.out.println(maxKey);
    }
}
