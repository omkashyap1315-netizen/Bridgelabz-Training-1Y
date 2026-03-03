package com.gla.Java_Packages.Colleges.main;

import college.student.Student;
import college.faculty.*;
import college.department.Department;

import static java.lang.Math.*;

public class MainApp {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Aman", "B.Tech CSE");
        Faculty f1 = new Faculty(201, "Dr. Sharma", "Data Structures");
        Department d1 = new Department("Computer Science", "Dr. Verma");

        System.out.println("===== COLLEGE INFORMATION =====\n");

        d1.displayDepartment();
        System.out.println();

        s1.displayStudent();
        System.out.println();

        f1.displayFaculty();
        System.out.println();

        double randomRank = round(random() * 100);
        System.out.println("College Performance Score: " + randomRank);
    }
}