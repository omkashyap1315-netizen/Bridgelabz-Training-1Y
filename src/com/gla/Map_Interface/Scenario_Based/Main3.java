package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] votes = {
                "Alice", "Bob", "Alice", "Carol", "Bob",
                "Alice", "Bob", "Carol", "Alice", "Bob"
        };

        for (String name : votes) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        String winner = "";
        int maxVotes = 0;

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > maxVotes) {
                maxVotes = value;
                winner = key;
            }
        }

        System.out.println("Winner: " + winner);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
