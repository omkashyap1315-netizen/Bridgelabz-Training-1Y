package com.gla;

import java.util.*;
public class Employeedata{
    public static void main(String[] args) {

        int[] ages = {25, 30, 22, 40, 28};

        ArrayList<Integer> list = new ArrayList<>();

        for(int a : ages){
            list.add(a); // auto boxing
        }

        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}
