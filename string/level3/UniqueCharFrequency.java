package com.gla.string.level3;

import java.util.Scanner;

public class UniqueCharFrequency {

    public static int stringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return length;
    }

    public static char[] uniqueCharacters(String str) {
        int len = stringLength(str);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < count; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = current;
                count++;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] charFrequency(String str) {
        int[] freq = new int[256];
        int len = stringLength(str);

        for (int i = 0; i < len; i++) {
            freq[str.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
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
