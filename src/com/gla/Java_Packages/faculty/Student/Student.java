package com.gla.Java_Packages.faculty.Student;

public class Student {

    String name;
    int rollNumber;

    // constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public void displayStudentDetails() {
    }
}
