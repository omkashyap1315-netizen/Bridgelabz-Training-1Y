package com.gla.Generics_Problems;

public class Main {

    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(10, 10));
        System.out.println(isEqual("Hello", "Hello"));
        System.out.println(isEqual(10.5, 20.5));
    }
}
