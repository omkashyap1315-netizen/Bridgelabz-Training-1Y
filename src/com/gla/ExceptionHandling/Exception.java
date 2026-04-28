package com.gla.ExceptionHandling;

public class Exception {
    public static void main(String[] args){
        int a=5 ;
        int b=0 ;
        int[] arr = {5,6,1,6,8,9};
        String str = null;

        System.out.println("a");
        try{
            System.out.println(6);
            System.out.println(str.length());
            System.out.println(a/b);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally execute");
        }
        System.out.println("b");

    }
}