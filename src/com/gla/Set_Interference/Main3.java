package com.gla.Set_Interference;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> result = new HashSet<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                result.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}
