package com.gla.Queue_Interface;

import java.util.*;

class Question {
    int id;
    String text;

    Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String toString() {
        return id + " " + text;
    }
}

class Student {
    String id;

    Student(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }
}

public class Online_Examination_Management_System {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(1, "Q1"));
        questions.add(new Question(2, "Q2"));
        questions.add(new Question(3, "Q3"));

        Collections.shuffle(questions);

        Set<String> studentSet = new HashSet<>();
        studentSet.add("S1");
        studentSet.add("S2");
        studentSet.add("S1");

        Queue<Student> queue = new LinkedList<>();
        queue.add(new Student("S1"));
        queue.add(new Student("S2"));
        queue.add(new Student("S3"));

        System.out.println("Serving students:");
        while (!queue.isEmpty()) {
            Student s = queue.remove();
            System.out.println(s);
        }

        Stack<Question> stack = new Stack<>();

        System.out.println("Navigating questions:");
        for (Question q : questions) {
            System.out.println("Current: " + q);
            stack.push(q);
        }

        System.out.println("Going back:");
        while (!stack.isEmpty()) {
            System.out.println("Back to: " + stack.pop());
        }
    }
}
