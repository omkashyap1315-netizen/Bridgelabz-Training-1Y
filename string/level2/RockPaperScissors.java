package com.gla.string.level2;

import java.util.Scanner;

public class RockPaperScissors {

    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        else if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        else {
            return "Computer";
        }
    }

    static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][2];

        double userPercent = ((double)userWins / totalGames) * 100;
        double computerPercent = ((double)computerWins / totalGames) * 100;
        double drawPercent = ((double)draws / totalGames) * 100;

        stats[0][0] = "User Wins";
        stats[0][1] = userWins + " (" + String.format("%.2f", userPercent) + "%)";

        stats[1][0] = "Computer Wins";
        stats[1][1] = computerWins + " (" + String.format("%.2f", computerPercent) + "%)";

        stats[2][0] = "Draws";
        stats[2][1] = draws + " (" + String.format("%.2f", drawPercent) + "%)";

        return stats;
    }

    static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i+1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nOverall Stats:");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t: " + stats[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.print("Game " + (i+1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, totalGames);

        displayResults(gameResults, stats);

        sc.close();
    }
}
