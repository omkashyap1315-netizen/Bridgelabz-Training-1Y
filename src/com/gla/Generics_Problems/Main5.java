package com.gla.Generics_Problems;

class Fruit {
    String name;

    Fruit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    Mango() {
        super("Mango");
    }
}

class Car {
    String name = "Car";
}

class FruitBox<T extends Fruit> {
    private java.util.ArrayList<T> list = new java.util.ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void display() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Apple());
        box.display();

        FruitBox<Fruit> box2 = new FruitBox<>();
        box2.add(new Apple());
        box2.add(new Mango());
        box2.display();

        FruitBox<Fruit> box3 = new FruitBox<>();
        box3.add(new Car());
    }
}
