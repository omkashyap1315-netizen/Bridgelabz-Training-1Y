package com.gla.Set_Interference;

import java.util.*;

class Policy implements Comparable<Policy> {
    String policyNumber;
    String name;
    Date expiryDate;
    String coverageType;
    double premium;

    Policy(String policyNumber, String name, Date expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.name = name;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return this.policyNumber.equals(p.policyNumber);
    }

    public int hashCode() {
        return policyNumber.hashCode();
    }

    public String toString() {
        return policyNumber + " " + name + " " + expiryDate + " " + coverageType + " " + premium;
    }
}

public class Insurance_Policy_Management_System {
    public static void main(String[] args) {
        HashSet<Policy> hashSet = new HashSet<>();
        LinkedHashSet<Policy> linkedSet = new LinkedHashSet<>();
        TreeSet<Policy> treeSet = new TreeSet<>();

        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DATE, 10);
        Policy p1 = new Policy("P1", "Alice", cal.getTime(), "Health", 5000);

        cal.add(Calendar.DATE, 20);
        Policy p2 = new Policy("P2", "Bob", cal.getTime(), "Auto", 3000);

        cal.add(Calendar.DATE, 40);
        Policy p3 = new Policy("P3", "Carol", cal.getTime(), "Home", 4000);

        Policy p4 = new Policy("P1", "Duplicate", cal.getTime(), "Health", 6000);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);

        linkedSet.addAll(hashSet);
        treeSet.addAll(hashSet);

        System.out.println("All policies:");
        for (Policy p : hashSet) {
            System.out.println(p);
        }

        System.out.println("\nExpiring within 30 days:");
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        Date future = c.getTime();

        for (Policy p : hashSet) {
            if (p.expiryDate.after(now) && p.expiryDate.before(future)) {
                System.out.println(p);
            }
        }

        System.out.println("\nHealth policies:");
        for (Policy p : hashSet) {
            if (p.coverageType.equals("Health")) {
                System.out.println(p);
            }
        }

        System.out.println("\nSorted by expiry (TreeSet):");
        for (Policy p : treeSet) {
            System.out.println(p);
        }

        long start = System.nanoTime();
        hashSet.contains(p2);
        long end = System.nanoTime();
        System.out.println("\nHashSet search time: " + (end - start));

        start = System.nanoTime();
        linkedSet.contains(p2);
        end = System.nanoTime();
        System.out.println("LinkedHashSet search time: " + (end - start));

        start = System.nanoTime();
        treeSet.contains(p2);
        end = System.nanoTime();
        System.out.println("TreeSet search time: " + (end - start));
    }
}
