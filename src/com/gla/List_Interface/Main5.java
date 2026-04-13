package com.gla.List_Interface;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        int i = 0;
        int j = 0;

        while (j < list.size()) {
            if (j - i == n) {
                i++;
            }
            j++;
        }

        System.out.println(list.get(i));
    }
}