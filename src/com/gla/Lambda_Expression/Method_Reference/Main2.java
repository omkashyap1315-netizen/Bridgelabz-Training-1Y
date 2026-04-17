package com.gla.Lambda_Expression.Method_Reference;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "amit", "sneha");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
