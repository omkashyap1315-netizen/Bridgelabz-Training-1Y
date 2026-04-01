package com.gla;

import java.util.*;
public class RatingAnalyze {
    public static void main(String[] args) {

        int[] oldRatings = {4,5,3};
        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(4);

        ArrayList<Integer> all = new ArrayList<>();

        for(int r : oldRatings){
            all.add(r);
        }

        all.addAll(newRatings);

        int sum = 0;
        int count = 0;

        for(Integer r : all){
            if(r != null){
                sum += r;
                count++;
            }
        }

        double avg = (double)sum / count;

        System.out.println("Average rating = " + avg);
    }
}