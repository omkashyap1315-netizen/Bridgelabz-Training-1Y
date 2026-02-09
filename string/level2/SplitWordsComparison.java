package com.gla.string.level2;

import java.util.Scanner;

public class SplitWordsComparison {

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

    static String[] splitUsingCharAt(String text) {

        int length = findLength(text);

        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < length; i++) {

            char ch = text.charAt(i);

            if (ch == ' ') {
                words[wordIndex] = currentWord;
                wordIndex++;
                currentWord = "";
            }
            else {
                currentWord = currentWord + ch;
            }
        }

        words[wordIndex] = currentWord;

        return words;
    }

    static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {

            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] userWords = splitUsingCharAt(text);

        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("Words using charAt():");
        for (int i = 0; i < userWords.length; i++) {
            System.out.println(userWords[i]);
        }

        System.out.println("\nWords using split():");
        for (int i = 0; i < builtInWords.length; i++) {
            System.out.println(builtInWords[i]);
        }

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
