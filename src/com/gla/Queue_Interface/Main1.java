package com.gla.Queue_Interface;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        q1.add(10);
        q1.add(20);
        q1.add(30);

        Queue<Integer> q2 = new LinkedList<>();

        while (!q1.isEmpty()) {
            int size = q1.size();
            for (int i = 0; i < size - 1; i++) {
                q1.add(q1.remove());
            }
            q2.add(q1.remove());
        }

        System.out.println(q2);
    }
}
