import java.util.Scanner;

public class SumOfNaturalNumbersComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number n
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive integer (natural number).");
            return;
        }

        // Calculating sum using the formula
        int sumFormula = n * (n + 1) / 2;

        // Calculating sum using a while loop
        int sumLoop = 0;
        int counter = 1;
        while (counter <= n) {
            sumLoop += counter;
            counter++;
        }

        // Comparing both sums
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using while loop: " + sumLoop);

        // Check if both results are equal
        if (sumFormula == sumLoop) {
            System.out.println("Both computations are correct!");
        } else {
            System.out.println("There seems to be an error in the computation.");
        }

        sc.close();
    }
}

