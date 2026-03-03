package com.gla.Java_Packages.bank;


import com.bank.util.InterestCalculator;
import static java.lang.Math.*;

public class MainApp {
    public static void main(String[] args) {

        double principal = 10000;
        double rate = 5;
        double time = 2;

        InterestCalculator calculator = new InterestCalculator();

        double si = calculator.calculateSimpleInterest(principal, rate, time);

        double ci = principal * (pow((1 + rate / 100), time)) - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);

        System.out.println("\nSimple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
