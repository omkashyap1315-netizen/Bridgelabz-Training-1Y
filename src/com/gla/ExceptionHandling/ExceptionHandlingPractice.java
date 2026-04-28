package com.gla.ExceptionHandling;

public class ExceptionHandlingPractice {
    static void ageChecker(int age) {
        if(age<18){
            throw new ArithmeticException("Invalid age for voting");
        }
        System.out.println("Valid age");
    }

    static void main(String[] args) {
        ageChecker(100);
    }
}
