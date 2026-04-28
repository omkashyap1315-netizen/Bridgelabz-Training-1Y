package com.gla.Queuepractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    static void main(String[] args) {
        Queue<String> q  = new LinkedList<>();
        q.add("Apple");
        q.add("Mango");
        q.add("Banana");
        System.out.println("Queue : "+q);
        System.out.println(q.peek());
        q.remove("Apple");
        System.out.println(q);
        q.remove("Mango");
        q.add("Orange");
        q.add("Apple");
        System.out.println(q);
        q.poll();
        System.out.println(q.poll());
        System.out.println(q.element());
        System.out.println(q);
        q.add("Sugarcane");
        System.out.println(q);
    }
}
