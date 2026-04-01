package com.gla;

public class StudentMarksReport {
    public static void main(String[] args) {

        // Mixed inputs
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        int sum = 0;
        int count = 0;

        for (Object obj : inputs) {
            try {
                if (obj == null) {
                    continue; // skip null
                }

                // Convert to String first
                String value = obj.toString();

                // Skip "null" string
                if (value.equalsIgnoreCase("null")) {
                    continue;
                }

                // Convert to Integer
                Integer mark = Integer.valueOf(value);

                sum += mark;
                count++;

            } catch (Exception e) {
                // Ignore invalid values like "abc"
            }
        }

        // Calculate average
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average Marks: " + average);
        } else {
            System.out.println("No valid marks found.");
        }
    }
}
