package com.gla.Stream_api.ForEach_Method;

import java.util.*;

public class Main4 {
    public static void sendEmailNotification(String email) {
        System.out.println("Email sent to " + email);
    }

    public static void main(String[] args) {
        List<String> emails = Arrays.asList("a@gmail.com", "b@gmail.com", "c@gmail.com");

        emails.forEach(email -> sendEmailNotification(email));
    }
}
