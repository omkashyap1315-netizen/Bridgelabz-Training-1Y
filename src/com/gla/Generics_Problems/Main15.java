package com.gla.Generics_Problems;

import java.util.*;

interface MealPlan {
    String getName();
}

class VegetarianMeal implements MealPlan {
    public String getName() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getName() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getName() {
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan {
    public String getName() {
        return "High Protein Meal";
    }
}

class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

class Main15 {

    public static <T extends MealPlan> Meal<T> generateMealPlan(T meal) {
        return new Meal<>(meal);
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> m2 = generateMealPlan(new VeganMeal());
        Meal<KetoMeal> m3 = generateMealPlan(new KetoMeal());

        System.out.println(m1.getMeal().getName());
        System.out.println(m2.getMeal().getName());
        System.out.println(m3.getMeal().getName());
    }
}
