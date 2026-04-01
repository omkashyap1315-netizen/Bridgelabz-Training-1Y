package com.gla;

import java.util.ArrayList;

public class PerformanceTest {
    public static void main(String[] args) {

        int n = 1_000_000;

        // -----------------------------
        // 1. Using ArrayList<Integer>
        // -----------------------------
        ArrayList<Integer> list = new ArrayList<>();

        long start1 = System.nanoTime();

        // Fill
        for (int i = 0; i < n; i++) {
            list.add(i); // autoboxing (int -> Integer)
        }

        // Sum
        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += list.get(i); // unboxing (Integer -> int)
        }

        long end1 = System.nanoTime();

        // -----------------------------
        // 2. Using int[]
        // -----------------------------
        int[] arr = new int[n];

        long start2 = System.nanoTime();

        // Fill
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // Sum
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += arr[i];
        }

        long end2 = System.nanoTime();

        // -----------------------------
        // Results
        // -----------------------------
        System.out.println("ArrayList Sum: " + sum1);
        System.out.println("ArrayList Time: " + (end1 - start1) / 1_000_000 + " ms");

        System.out.println("Array Sum: " + sum2);
        System.out.println("Array Time: " + (end2 - start2) / 1_000_000 + " ms");
    }
}
