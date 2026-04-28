package com.gla.collection;
import java.util.ArrayList;
public class Getaddremove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Hello");
        System.out.println(list);
        System.out.println(list.get(1));  //get
        list.add(1,"Om");
        System.out.println(list);
        System.out.println(list.size());    //size
        list.remove(1);
        System.out.println(list);
        list.set(1,"Hamza");    //set
        System.out.println(list);
        System.out.println(list.contains("Hamza"));//contains
        System.out.println();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + " ");  //total how many
        }
        System.out.println();
        for(String str: list){
            System.out.println(str);
        }
    }
}