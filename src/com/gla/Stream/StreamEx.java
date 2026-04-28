package com.gla.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();

//        array -> streams
        String[] arr = {"apple","banana","cherry"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

//        direct stream
        Stream<Integer> stream1 = Stream.of(1,2,3,6,8);

//        operations
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,4322,9,0,5,44,23,433);

//        normal method to filter element
        List<Integer> filteredVal = new ArrayList<>();
        for(Integer x:list1){
            if(x%2==0){
                filteredVal.add(x);
            }
        }
        System.out.println(filteredVal);

//        filter
        List<Integer> filteredList1 = list1.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println(filteredList1);
//        map
        List<Integer> doubledValue = filteredList1.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println(doubledValue);

//        distinct & sorted() & chaining of methods
        List<Integer> filteredList2 = list1.stream().filter(x->x%2 == 0).map(x->x*2).distinct().sorted()
                .limit(5).skip(1).collect(Collectors.toList());

        System.out.println(filteredList2);
//        count()
        Long totalElements = list1.stream().count();
        System.out.println(totalElements);

    }
}

