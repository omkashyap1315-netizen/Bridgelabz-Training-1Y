package com.gla.Queuepractice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxPriortyQueuePractice {
    static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(367);
        q.offer(789);
        q.offer(852);
        q.offer(789654);

        q.poll();
        System.out.println(q.element());
    }
}
