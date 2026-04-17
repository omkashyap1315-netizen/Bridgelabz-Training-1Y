package com.gla.Stream_api;

import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() { return rating; }
    public int getYear() { return year; }
    public String toString() { return name + " " + rating + " " + year; }
}

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("A", 8.5, 2022),
                new Movie("B", 9.0, 2023),
                new Movie("C", 7.5, 2021),
                new Movie("D", 8.8, 2023),
                new Movie("E", 9.2, 2024),
                new Movie("F", 8.0, 2022)
        );

        movies.stream()
                .sorted(Comparator.comparing(Movie::getRating).reversed()
                        .thenComparing(Movie::getYear).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}