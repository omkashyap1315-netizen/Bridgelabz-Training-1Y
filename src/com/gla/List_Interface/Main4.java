package com.gla.List_Interface;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : list) {
            if (!set.contains(num)) {
                set.add(num);
                result.add(num);
            }
        }

        System.out.println(result);
    }
}
