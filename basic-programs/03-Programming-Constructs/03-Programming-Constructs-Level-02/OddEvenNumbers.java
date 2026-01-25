import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check if the entered number is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Please enter a positive integer (natural number).");
            return;
        }

        // Iterate from 1 to the entered number using a for loop
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }

        sc.close();
    }
}

