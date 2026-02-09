package com.gla.string.level3;

import java.util.Scanner;

public class CharFrequency {

    public static String[][] charFrequency(String str) {
        int[] freq = new int[256];
        int len = 0;

        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {}

        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char)i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencies = charFrequency(input);

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " : " + frequencies[i][1]);
        }
    }
}
