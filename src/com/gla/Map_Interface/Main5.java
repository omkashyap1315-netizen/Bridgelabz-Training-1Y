package com.gla.Map_Interface;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (Employee e : list) {
            if (!map.containsKey(e.department)) {
                map.put(e.department, new ArrayList<>());
            }
            map.get(e.department).add(e.name);
        }

        for (String dept : map.keySet()) {
            System.out.println(dept + ": " + map.get(dept));
        }
    }
}
