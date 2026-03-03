package com.gla.Java_Packages.bank;

public class InterestCalculator {

    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (Math.pow((1 + rate / 100), time)) - principal;
    }
}
