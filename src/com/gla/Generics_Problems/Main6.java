package com.gla.Generics_Problems;

import java.util.*;

class Main6 {

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);

        System.out.println(sumNumbers(intList));
        System.out.println(sumNumbers(doubleList));
    }
}
