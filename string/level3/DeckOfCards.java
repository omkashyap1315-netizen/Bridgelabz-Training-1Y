package com.gla.string.level3;

import java.util.Scanner;

public class DeckOfCards {

    // Initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    // Shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distribute the deck to players
    public static String[][] distributeDeck(String[] deck, int numPlayers, int numCardsPerPlayer) {
        if (numPlayers * numCardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[numPlayers][numCardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < numCardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[cardIndex];
                cardIndex++;
            }
        }
        return players;
    }

    // Print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numCardsPerPlayer = sc.nextInt();

        String[][] players = distributeDeck(deck, numPlayers, numCardsPerPlayer);
        if (players != null) {
            printPlayersCards(players);
        }
    }
}
