package com.gla.string.JavaStringPracticeProblem;

import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findMostFrequent(text);

        System.out.println("Most Frequent Character: '" + result + "'");
    }

    public static char findMostFrequent(String str) {

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }
}
