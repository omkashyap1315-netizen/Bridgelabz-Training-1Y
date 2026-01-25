import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check if the entered number is a positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }

        // Running a for loop backward from 100 to 1
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  // If i is a multiple of the number
                System.out.println(i);  // Print the multiple
            }
        }

        sc.close();
    }
}


