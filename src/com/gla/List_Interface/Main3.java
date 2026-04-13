package com.gla.List_Interface;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int k = 2;

        for (int i = 0; i < k; i++) {
            int first = list.get(0);
            list.remove(0);
            list.add(first);
        }

        System.out.println(list);
    }
}
