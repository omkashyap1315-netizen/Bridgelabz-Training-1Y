package com.gla.List_Interface;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for (int i = 0; i < arr.size() / 2; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - 1 - i));
            arr.set(arr.size() - 1 - i, temp);
        }

        System.out.println("Reversed ArrayList: " + arr);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }

        System.out.println("Reversed LinkedList: " + list);
    }
}
