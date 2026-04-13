package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        String[] words = sentence.toLowerCase().replaceAll("[^a-z ]", "").split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.length() > 0) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
