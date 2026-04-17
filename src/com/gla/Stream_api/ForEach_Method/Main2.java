package com.gla.Stream_api.ForEach_Method;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Rahul", "Amit", "Sneha");

        attendees.forEach(name -> System.out.println("Welcome " + name));
    }
}
