package com.gla;

public class GameScoreboard {
    public static void main(String[] args) {

        // Example scores (null means player has not played)
        Integer[] scores = {100, null, 80, 95, null, 70};

        int notPlayedCount = 0;
        int totalScore = 0;

        for (Integer score : scores) {

            if (score == null) {
                notPlayedCount++;   // count players who haven't played
            } else {
                totalScore += score;  // auto-unboxing happens here
            }
        }

        // Output results
        System.out.println("Players not played: " + notPlayedCount);
        System.out.println("Total score of valid players: " + totalScore);
    }
}
