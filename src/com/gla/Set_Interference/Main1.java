package com.gla.Set_Interference;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        if (set1.equals(set2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
