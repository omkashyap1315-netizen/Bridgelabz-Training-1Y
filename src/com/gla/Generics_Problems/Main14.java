package com.gla.Generics_Problems;

import java.util.*;

abstract class CourseType {
    String name;

    CourseType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}

class Main14 {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Operating Systems"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Web Development"));
        assignmentCourses.addCourse(new AssignmentCourse("Python Programming"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing"));

        System.out.println("Exam Courses:");
        displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        displayCourses(researchCourses.getCourses());
    }
}
