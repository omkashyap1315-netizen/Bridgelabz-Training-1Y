package com.gla.Queue_Interface;

import java.util.*;

class College_Admission_System implements Comparable<Student> {
    String name;
    int marks;

    College_Admission_System(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return this.name.equals(s.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public int compareTo(Student s) {
        return s.marks - this.marks;
    }

    public String toString() {
        return name + " " + marks;
    }
}

public class collegeAdmissionSystem {
    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>();

        applicants.add(new Student("A", 85));
        applicants.add(new Student("B", 70));
        applicants.add(new Student("C", 90));
        applicants.add(new Student("D", 60));
        applicants.add(new Student("A", 85));

        Set<Student> shortlisted = new HashSet<>();

        for (Student s : applicants) {
            if (s.marks >= 75) {
                shortlisted.add(s);
            }
        }

        Queue<Student> queue = new LinkedList<>(shortlisted);

        System.out.println("Interview process:");
        List<Student> selected = new ArrayList<>();

        while (!queue.isEmpty()) {
            Student s = queue.remove();
            System.out.println("Interviewed: " + s);

            if (s.marks >= 80) {
                selected.add(s);
            }
        }

        TreeSet<Student> meritList = new TreeSet<>(selected);

        System.out.println("Final Merit List:");
        for (Student s : meritList) {
            System.out.println(s);
        }
    }
}
