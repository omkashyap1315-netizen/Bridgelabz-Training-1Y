package com.gla.Map_Interface;

import java.io.*;
        import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        HashMap<String, Integer> map = new HashMap<>();

        while (sc.hasNext()) {
            String word = sc.next().toLowerCase().replaceAll("[^a-z]", "");
            if (!word.isEmpty()) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }

        System.out.println(map);
    }
}
