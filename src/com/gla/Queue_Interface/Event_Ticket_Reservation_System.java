package com.gla.Queue_Interface;

import java.util.*;

class Booking {
    String user;
    boolean vip;

    Booking(String user, boolean vip) {
        this.user = user;
        this.vip = vip;
    }

    public String toString() {
        return user + " " + (vip ? "VIP" : "Normal");
    }
}

public class Event_Ticket_Reservation_System {
    public static void main(String[] args) {
        List<Booking> bookings = new ArrayList<>();

        Set<String> users = new HashSet<>();

        Queue<Booking> queue = new LinkedList<>();

        PriorityQueue<Booking> pq = new PriorityQueue<>(
                (a, b) -> (b.vip ? 1 : 0) - (a.vip ? 1 : 0)
        );

        if (users.add("U1")) queue.add(new Booking("U1", false));
        if (users.add("U2")) queue.add(new Booking("U2", true));
        if (users.add("U3")) queue.add(new Booking("U3", false));
        if (users.add("U2")) queue.add(new Booking("U2", true));

        while (!queue.isEmpty()) {
            pq.add(queue.remove());
        }

        while (!pq.isEmpty()) {
            Booking b = pq.remove();
            System.out.println("Confirmed: " + b);
            bookings.add(b);
        }

        System.out.println("All bookings:");
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }
}
