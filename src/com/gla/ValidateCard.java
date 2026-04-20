package com.gla.src.com.gla;

import java.util.regex.*;

public class ValidateCard {
    public static void main(String[] args) {
        String card = "4123456789012345";
        boolean valid = Pattern.matches("^(4\\d{15}|5\\d{15})$", card);
        System.out.println(valid);
    }
}
