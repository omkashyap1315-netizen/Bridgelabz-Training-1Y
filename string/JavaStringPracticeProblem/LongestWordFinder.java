package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class LongestWordFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String longest = findLongestWord(sentence);

        System.out.println("Longest word: " + longest);
    }

    public static String findLongestWord(String sentence) {

        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
