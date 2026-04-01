package com.gla;

public class Userinput {
    public static boolean validateAge(String age){

        try{
            int a = Integer.parseInt(age);

            if(a >= 18){
                return true;
            }
        }
        catch(NumberFormatException e){
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(validateAge("20"));
        System.out.println(validateAge("15"));
        System.out.println(validateAge("abc"));
    }
}
