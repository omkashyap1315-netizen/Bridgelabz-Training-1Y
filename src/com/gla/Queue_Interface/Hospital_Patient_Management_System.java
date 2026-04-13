package com.gla.Queue_Interface;

import java.util.*;

class Hospital_Patient_Management_System {
    String id;
    String name;

    Hospital_Patient_Management_System(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return this.id.equals(p.id);
    }

    public int hashCode() {
        return id.hashCode();
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Hospital_Patient_Management_System {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> queue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient p1 = new Patient("P1", "John");
        Patient p2 = new Patient("P2", "Alice");
        Patient p3 = new Patient("P3", "Bob");

        if (admitted.add(p1)) queue.add(p1);
        if (admitted.add(p2)) queue.add(p2);
        if (admitted.add(p3)) queue.add(p3);

        while (!queue.isEmpty()) {
            Patient p = queue.remove();
            System.out.println("Treated: " + p);

            discharged.push(p);
            history.add(p);
        }

        if (!discharged.isEmpty()) {
            Patient p = discharged.pop();
            System.out.println("Re-admitted: " + p);

            if (admitted.add(p)) {
                queue.add(p);
            }
        }

        System.out.println("All patient history:");
        for (Patient p : history) {
            System.out.println(p);
        }
    }
}
