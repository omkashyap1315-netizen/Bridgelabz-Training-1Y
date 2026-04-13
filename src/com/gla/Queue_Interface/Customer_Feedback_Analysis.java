package com.gla.Queue_Interface;

import java.util.*;

public class Customer_Feedback_Analysis {
    public static void main(String[] args) {
        List<String> feedbackList = new ArrayList<>();

        feedbackList.add("Good service");
        feedbackList.add("Nice app");
        feedbackList.add("Good service");
        feedbackList.add("Needs improvement");
        feedbackList.add("Nice app");

        Set<String> uniqueFeedback = new HashSet<>(feedbackList);

        Queue<String> queue = new LinkedList<>(uniqueFeedback);

        Stack<String> stack = new Stack<>();

        System.out.println("Processing feedback:");

        while (!queue.isEmpty()) {
            String f = queue.remove();
            System.out.println(f);
            stack.push(f);
        }

        System.out.println("Recent feedbacks:");

        int count = 0;
        while (!stack.isEmpty() && count < 3) {
            System.out.println(stack.pop());
            count++;
        }
    }
}
