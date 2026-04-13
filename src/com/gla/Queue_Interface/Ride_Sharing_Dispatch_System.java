package com.gla.Queue_Interface;

import java.util.*;

class RideRequest {
    String customer;
    int priority;

    RideRequest(String customer, int priority) {
        this.customer = customer;
        this.priority = priority;
    }

    public String toString() {
        return customer + " " + priority;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return this.name.equals(d.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name;
    }
}

class Ride {
    String customer;
    String driver;

    Ride(String customer, String driver) {
        this.customer = customer;
        this.driver = driver;
    }

    public String toString() {
        return customer + " -> " + driver;
    }
}

public class Ride_Sharing_Dispatch_System {
    public static void main(String[] args) {
        Queue<RideRequest> queue = new LinkedList<>();

        PriorityQueue<RideRequest> pq = new PriorityQueue<>(
                (a, b) -> b.priority - a.priority
        );

        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver("D1"));
        drivers.add(new Driver("D2"));
        drivers.add(new Driver("D3"));

        List<Ride> completed = new ArrayList<>();

        pq.add(new RideRequest("C1", 2));
        pq.add(new RideRequest("C2", 5));
        pq.add(new RideRequest("C3", 3));

        while (!pq.isEmpty() && !drivers.isEmpty()) {
            RideRequest req = pq.remove();

            Driver driver = drivers.iterator().next();
            drivers.remove(driver);

            System.out.println("Assigned: " + req.customer + " -> " + driver.name);

            completed.add(new Ride(req.customer, driver.name));
        }

        System.out.println("Completed rides:");
        for (Ride r : completed) {
            System.out.println(r);
        }
    }
}
