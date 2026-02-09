package com.gla.string.level2;

import java.util.Scanner;

public class WordLength2DArray {

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

            int len = findLength(words[i]);

            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] table = wordAndLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < table.length; i++) {

            int lengthValue = Integer.parseInt(table[i][1]);

            System.out.println(table[i][0] + "\t" + lengthValue);
        }

        sc.close();
    }
}
