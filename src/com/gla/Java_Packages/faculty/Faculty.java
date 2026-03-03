package com.gla.Java_Packages.faculty;

public class Faculty {

    String name;
    String subject;

    // constructor
    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }

    public void displayFacultyDetails() {
    }
}
