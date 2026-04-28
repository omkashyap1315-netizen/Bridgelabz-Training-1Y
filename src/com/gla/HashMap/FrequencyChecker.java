package com.gla.HashMap;

import java.util.HashMap;

public class FrequencyChecker {
    static void main(String[] args) {
        int[] arr = {2,4,1,2,6,4,2,1,9};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else {
                map.put(val,1);
            }
        }
        System.out.println(map);
    }
}
