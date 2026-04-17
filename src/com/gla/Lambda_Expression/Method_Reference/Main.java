package com.gla.Lambda_Expression.Method_Reference;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(101, 102, 103);

        ids.forEach(System.out::println);
    }
}
