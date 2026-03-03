package com.gla.Java_Packages.School.Main;

import com.school.data.*;
import com.school.util.*;

public class MainApp {
    public static void main(String[] args) {

        Student student = new Student("Aman", 85, 78, 92);
        Analyzer analyzer = new Analyzer();

        double average = analyzer.calculateAverage(student);
        String grade = analyzer.findGrade(average);

        System.out.println(student);
        System.out.println("\nAverage: " + average);
        System.out.println("Grade: " + grade);
    }
}
