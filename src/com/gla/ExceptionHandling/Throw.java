package com.gla.ExceptionHandling;

public class Throw {
    public static void main(String[] args){
        int age = 16;
        if (age<18){
            throw new ArithmeticException("not eligible");

        }
        else {
            System.out.println("you can vote");
        }
    }
}
