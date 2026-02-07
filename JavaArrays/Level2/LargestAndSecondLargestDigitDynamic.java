package JavaArrays.Level2;

import java.util.Scanner;

public class LargestAndSecondLargestDigitDynamic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Initial array setup
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d & e. Extract digits and store in array
        while (number != 0) {

            // a & b (new): Increase array size if full
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];

                // Copy old values to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; // assign expanded array
            }

            digits[index] = number % 10; // extract last digit
            number = number / 10;
            index++;
        }

        // g. Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
