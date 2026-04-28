package com.gla.Set;
import java.util.*;

public class Set2 {
    static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(18);
        set.add(17);
        set.add(45);
        set.add(7);
        set.add(333);

        System.out.println(set);
        set.remove(333);
        System.out.println(set);
        System.out.println(set.contains(150));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        for (int val : set) {
            System.out.print(val + " ");
        }
        System.out.println();

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}