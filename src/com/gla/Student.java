package com.gla;

import java.util.*;
public class Student {

    public static void main(String[] args) {

        Object[] marks = {"85", 95, Integer.valueOf(88), "null"};

        int sum = 0;
        int count = 0;

        for(Object m : marks){
            try{

                if(m instanceof String){
                    if(m.equals("null")) continue;

                    int val = Integer.parseInt((String)m);
                    sum += val;
                    count++;
                }
                else if(m instanceof Integer){
                    sum += (Integer)m;
                    count++;
                }

            }catch(Exception e){
                System.out.println("Invalid mark: " + m);
            }
        }

        System.out.println("Average = " + (sum/count));
    }
}
