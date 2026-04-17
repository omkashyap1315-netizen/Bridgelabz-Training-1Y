package com.gla.Stream_api.ForEach_Method;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(101.5, 102.3, 99.8, 105.2);

        prices.forEach(p -> System.out.println(p));
    }
}
