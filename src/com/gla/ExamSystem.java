package com.gla;

class Entry extends Thread {
    public void run() {
        System.out.println("Student Entry Started");
        while (true) {
            System.out.println("Students entering...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}

class QuestionPaper extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Question Papers Distributed");
        } catch (InterruptedException e) {}
    }
}

class Attendance extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("Attendance Marked");
        } catch (InterruptedException e) {}
    }
}

class Collection extends Thread {
    public void run() {
        try {
            Thread.sleep(15000);
            System.out.println("Answer Sheets Collected");
        } catch (InterruptedException e) {}
    }
}

public class ExamSystem {
    public static void main(String[] args) {
        Entry e = new Entry();
        QuestionPaper qp = new QuestionPaper();
        Attendance at = new Attendance();
        Collection col = new Collection();

        qp.setPriority(10);
        at.setPriority(8);
        col.setPriority(7);
        e.setPriority(5);

        e.start();
        qp.start();
        at.start();
        col.start();
    }
}
