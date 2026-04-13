package com.gla.Set_Interference;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        System.out.println(list);
    }
}
