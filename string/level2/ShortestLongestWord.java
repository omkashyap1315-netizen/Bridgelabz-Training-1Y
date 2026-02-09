package com.gla.string.level2;

import java.util.Scanner;

public class ShortestLongestWord {

    static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    static String[] splitWords(String text) {

        int length = findLength(text);

        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String current = "";

        for (int i = 0; i < length; i++) {

            char ch = text.charAt(i);

            if (ch == ' ') {
                words[index] = current;
                index++;
                current = "";
            }
            else {
                current = current + ch;
            }
        }

        words[index] = current;

        return words;
    }

    static String[][] wordAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    static int[] findShortestLongest(String[][] data) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < data.length; i++) {

            int currentLength = Integer.parseInt(data[i][1]);
            int shortestLength = Integer.parseInt(data[shortestIndex][1]);
            int longestLength = Integer.parseInt(data[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] table = wordAndLength(words);

        int[] result = findShortestLongest(table);

        System.out.println("\nShortest word: " + table[result[0]][0]);
        System.out.println("Longest word: " + table[result[1]][0]);

        sc.close();
    }
}
