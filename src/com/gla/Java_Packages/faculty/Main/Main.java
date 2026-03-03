package com.gla.Java_Packages.faculty.Main;

import com.gla.Java_Packages.faculty.Student.Student;
import com.gla.Java_Packages.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Aman", 101);
        Faculty f = new Faculty("Dr. Sharma", "Computer Science");

        s.displayStudentDetails();
        System.out.println();
        f.displayFacultyDetails();
    }
}