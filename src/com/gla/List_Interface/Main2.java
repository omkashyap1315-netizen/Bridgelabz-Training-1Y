package com.gla.List_Interface;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        HashMap<String, Integer> map = new HashMap<>();

        for (String item : list) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        System.out.println(map);
    }
}
