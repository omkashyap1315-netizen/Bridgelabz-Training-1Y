package com.gla.arrays;
import java.util.*;
public class GreatestElements {
    static void main(String[] args) {
        int max=0;
        int []arr={3,5,7,8,1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("MAX element of the given array:"+max);
    }
}