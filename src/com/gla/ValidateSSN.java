package com.gla.src.com.gla;

import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        String ssn = "123-45-6789";
        boolean valid = Pattern.matches("^\\d{3}-\\d{2}-\\d{4}$", ssn);
        System.out.println(valid);
    }
}
