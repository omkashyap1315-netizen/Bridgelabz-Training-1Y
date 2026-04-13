package com.gla.Generics_Problems;

import java.util.*;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }
}

class Cat extends Animal {
    Cat() {
        super("Cat");
    }
}

class Main8 {

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        printAnimals(dogs);
        printAnimals(cats);
    }
}
