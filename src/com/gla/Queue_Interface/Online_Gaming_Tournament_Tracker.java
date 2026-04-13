package com.gla.Queue_Interface;

import java.util.*;

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return this.name.equals(p.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name;
    }
}

class Match {
    String p1, p2;

    Match(String p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return p1 + " vs " + p2;
    }
}

class Result {
    String winner;
    int score;

    Result(String winner, int score) {
        this.winner = winner;
        this.score = score;
    }

    public String toString() {
        return winner + " " + score;
    }
}

class Score implements Comparable<Score> {
    String name;
    int score;

    Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Score s) {
        return s.score - this.score;
    }

    public String toString() {
        return name + " " + score;
    }
}

public class Online_Gaming_Tournament_Tracker {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        players.add(new Player("A"));
        players.add(new Player("B"));
        players.add(new Player("C"));
        players.add(new Player("A"));

        Queue<Match> queue = new LinkedList<>();
        queue.add(new Match("A", "B"));
        queue.add(new Match("B", "C"));

        List<Result> results = new ArrayList<>();

        TreeSet<Score> leaderboard = new TreeSet<>();

        while (!queue.isEmpty()) {
            Match m = queue.remove();
            System.out.println("Playing: " + m);

            Result r = new Result(m.p1, (int)(Math.random() * 100));
            results.add(r);

            leaderboard.add(new Score(r.winner, r.score));
        }

        System.out.println("Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("Leaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}
