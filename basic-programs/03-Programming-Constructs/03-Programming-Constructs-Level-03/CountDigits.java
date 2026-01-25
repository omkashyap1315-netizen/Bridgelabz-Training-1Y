import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 1: Initialize count to 0
        int count = 0;

        // Step 2: Use a loop to count digits until number becomes 0
        while (number != 0) {
            // Step 3: Remove the last digit
            number /= 10;

            // Step 4: Increase count by 1
            count++;
        }

        // Step 5: Display the number of digits
        System.out.println("The number has " + count + " digits.");

        sc.close();
    }
}

