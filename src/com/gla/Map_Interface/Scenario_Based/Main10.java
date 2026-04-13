package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] visits = {
                "home", "about", "products", "home",
                "products", "contact", "home", "about",
                "products", "home"
        };

        for (String page : visits) {
            if (map.containsKey(page)) {
                map.put(page, map.get(page) + 1);
            } else {
                map.put(page, 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        System.out.println("Pages sorted by visits:");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        String maxPage = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxPage = key;
            }
        }

        System.out.println("Most visited page: " + maxPage);
    }
}
