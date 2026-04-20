package com.gla.src.com.gla;

import java.util.regex.Pattern;

public class LicenseValidation {
    public static void main(String[] args) {
        String license = "AB1234";
        boolean isValid = Pattern.compile("^[A-Z]{2}[0-9]{4}$")
                .matcher(license)
                .matches();
        System.out.println(isValid);
    }
}
