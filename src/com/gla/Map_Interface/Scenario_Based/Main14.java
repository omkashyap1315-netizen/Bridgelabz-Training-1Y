package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main14 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();

        HashMap<String, Integer> math = new HashMap<>();
        math.put("Alice", 95);
        math.put("Bob", 80);
        math.put("Carol", 88);

        HashMap<String, Integer> science = new HashMap<>();
        science.put("Alice", 85);
        science.put("Bob", 92);
        science.put("Carol", 78);

        HashMap<String, Integer> english = new HashMap<>();
        english.put("Alice", 70);
        english.put("Bob", 75);
        english.put("Carol", 91);

        map.put("Math", math);
        map.put("Science", science);
        map.put("English", english);

        for (String subject : map.keySet()) {
            HashMap<String, Integer> students = map.get(subject);

            String topStudent = "";
            int max = 0;

            int sum = 0;
            boolean above90 = false;

            for (String name : students.keySet()) {
                int marks = students.get(name);

                if (marks > max) {
                    max = marks;
                    topStudent = name;
                }

                sum += marks;

                if (marks > 90) {
                    above90 = true;
                }
            }

            double avg = (double) sum / students.size();

            System.out.println("Subject: " + subject);
            System.out.println("Top scorer: " + topStudent + " " + max);
            System.out.println("Average: " + avg);

            if (above90) {
                System.out.println("Above 90 present");
            }

            System.out.println();
        }
    }
}