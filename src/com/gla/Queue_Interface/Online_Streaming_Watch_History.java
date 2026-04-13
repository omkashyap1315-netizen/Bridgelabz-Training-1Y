package com.gla.Queue_Interface;

import java.util.*;

class Movie {
    String name;
    String genre;

    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String toString() {
        return name + " " + genre;
    }
}

public class Online_Streaming_Watch_History {
    public static void main(String[] args) {
        Stack<Movie> history = new Stack<>();
        List<Movie> allMovies = new ArrayList<>();
        Set<String> genres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        allMovies.add(new Movie("M1", "Action"));
        allMovies.add(new Movie("M2", "Comedy"));
        allMovies.add(new Movie("M3", "Action"));
        allMovies.add(new Movie("M4", "Drama"));

        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(1));
        upNext.add(allMovies.get(2));

        while (!upNext.isEmpty()) {
            Movie m = upNext.remove();
            System.out.println("Watching: " + m);

            history.push(m);
            genres.add(m.genre);
        }

        System.out.println("Watched genres: " + genres);

        System.out.println("Recommended movies:");
        for (Movie m : allMovies) {
            if (genres.contains(m.genre)) {
                System.out.println(m);
            }
        }
    }
}
