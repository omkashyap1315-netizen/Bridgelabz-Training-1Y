package com.gla.Stream_api;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "amit", "sneha");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
