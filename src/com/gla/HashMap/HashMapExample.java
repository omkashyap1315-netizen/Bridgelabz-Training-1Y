package com.gla.HashMap;

import java.util.HashMap;

public class HashMapExample {
    static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("Om",14);
        map.put("Chirag",97);
        map.put("Ramu",99);
        map.put("Chirag",99);

        System.out.print(map);

        System.out.println(map.get("Om"));
        System.out.println(map.containsKey("Om"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        for(String key:map.keySet()){
            System.out.println(map.get(key)+" ");
        }

    }
}
