package com.gla;

import java.util.Random;

class Ticket extends Thread {
    private int id;
    private String type;
    private int priority;

    public Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
        this.setPriority(priority);
    }

    public void run() {
        Random r = new Random();
        int time = (r.nextInt(5) + 1) * 1000;

        System.out.println("Ticket " + id + " (" + type + ") started by "
                + Thread.currentThread().getName() + " Priority: " + priority);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {}

        System.out.println("Ticket " + id + " completed in " + time + " ms");
    }
}

public class SupportSystem {
    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket(1, "Critical Bug", 10),
                new Ticket(2, "Feature Request", 4),
                new Ticket(3, "General Query", 2),
                new Ticket(4, "Feedback", 1),
                new Ticket(5, "Critical Bug", 10),
                new Ticket(6, "General Query", 2),
                new Ticket(7, "Feature Request", 4),
                new Ticket(8, "Feedback", 1),
                new Ticket(9, "Critical Bug", 10),
                new Ticket(10, "General Query", 2)
        };

        for (int i = 0; i < tickets.length; i++) {
            tickets[i].setName("Agent-" + (i + 1));
            tickets[i].start();
        }
    }
}
