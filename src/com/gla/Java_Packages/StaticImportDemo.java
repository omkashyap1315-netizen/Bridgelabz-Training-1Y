package com.gla.Java_Packages;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {

        double number = 25;

        System.out.println("Square Root: " + sqrt(number));
        System.out.println("Power: " + pow(2, 3));
        System.out.println("Maximum: " + max(10, 20));
        System.out.println("Minimum: " + min(5, 3));
        System.out.println("Absolute Value: " + abs(-15));
    }
}