package com.gla.Queuepractice;

import java.util.PriorityQueue;

public class priortyQueuePractice {
    static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(14);
        q.offer(2);
        q.offer(23);
        q.offer(87);
        q.poll();
        System.out.println(q.element());
    }
}
