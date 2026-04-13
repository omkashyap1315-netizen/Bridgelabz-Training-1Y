package com.gla.Queue_Interface;

import java.util.*;

class Parcel {
    String id;
    int priority;

    Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public String toString() {
        return id + " " + priority;
    }
}

public class Courier_Delivery_Routing_System {
    public static void main(String[] args) {
        PriorityQueue<Parcel> pq = new PriorityQueue<>(
                (a, b) -> b.priority - a.priority
        );

        Queue<Parcel> queue = new LinkedList<>();

        Set<String> ids = new HashSet<>();

        List<Parcel> completed = new ArrayList<>();

        Parcel p1 = new Parcel("P1", 5);
        Parcel p2 = new Parcel("P2", 2);
        Parcel p3 = new Parcel("P3", 4);
        Parcel p4 = new Parcel("P2", 3);

        if (ids.add(p1.id)) pq.add(p1);
        if (ids.add(p2.id)) queue.add(p2);
        if (ids.add(p3.id)) pq.add(p3);
        if (ids.add(p4.id)) queue.add(p4);

        while (!pq.isEmpty()) {
            Parcel p = pq.remove();
            System.out.println("Delivered (priority): " + p);
            completed.add(p);
        }

        while (!queue.isEmpty()) {
            Parcel p = queue.remove();
            System.out.println("Delivered (normal): " + p);
            completed.add(p);
        }

        System.out.println("Completed deliveries:");
        for (Parcel p : completed) {
            System.out.println(p);
        }
    }
}
