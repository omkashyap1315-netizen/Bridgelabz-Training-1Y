import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the entered number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Find and print all the factors of the number
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // If i is a factor of number
                System.out.println(i);
            }
        }

        sc.close();
    }
}

