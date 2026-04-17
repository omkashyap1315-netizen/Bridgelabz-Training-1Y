package com.gla.Stream_api.ForEach_Method;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45, 60, 30, 80, 55);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(r -> System.out.println(r));
    }
}
