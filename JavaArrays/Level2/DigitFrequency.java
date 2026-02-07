import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long temp = num;

        // b. Find count of digits
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        // c. Store digits in an array
        int[] digits = new int[count];
        temp = num;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // d. Frequency array
        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // e. Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " : " + freq[i]);
            }
        }

        sc.close();
    }
}
