package com.gla.Queue_Interface;

import java.util.*;

class Team {
    String name;
    int points;

    Team(String name) {
        this.name = name;
        this.points = 0;
    }
}

class Match {
    Team team1;
    Team team2;

    Match(Team t1, Team t2) {
        this.team1 = t1;
        this.team2 = t2;
    }
}

class Result {
    String team1;
    String team2;
    String winner;

    Result(String t1, String t2, String winner) {
        this.team1 = t1;
        this.team2 = t2;
        this.winner = winner;
    }
}

public class Sports_Tournament_Scheduler {
    public static void main(String[] args) {

        Set<Team> teams = new HashSet<>();
        Queue<Match> matches = new LinkedList<>();
        List<Result> results = new ArrayList<>();

        Team a = new Team("India");
        Team b = new Team("Australia");
        Team c = new Team("England");

        teams.add(a);
        teams.add(b);
        teams.add(c);

        matches.add(new Match(a, b));
        matches.add(new Match(b, c));
        matches.add(new Match(a, c));

        while (!matches.isEmpty()) {
            Match m = matches.poll();

            Team winner;
            if (Math.random() > 0.5) {
                winner = m.team1;
            } else {
                winner = m.team2;
            }

            winner.points += 2;

            results.add(new Result(m.team1.name, m.team2.name, winner.name));
        }

        Set<Team> leaderboard = new TreeSet<>((t1, t2) -> {
            if (t2.points != t1.points) return t2.points - t1.points;
            return t1.name.compareTo(t2.name);
        });

        leaderboard.addAll(teams);

        for (Result r : results) {
            System.out.println(r.team1 + " vs " + r.team2 + " -> Winner: " + r.winner);
        }

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t.name + " : " + t.points);
        }
    }
}
