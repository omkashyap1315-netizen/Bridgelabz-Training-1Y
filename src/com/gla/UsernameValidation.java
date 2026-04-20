package com.gla.src.com.gla;

import java.util.regex.Pattern;

public class UsernameValidation {
    public static void main(String[] args) {
        String username = "user_123";
        boolean isValid = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,14}$")
                .matcher(username)
                .matches();
        System.out.println(isValid);
    }
}
