import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the first number, second number, and operator
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = sc.next();

        // Perform operation based on the operator using switch-case
        double result = 0;
        boolean validOperator = true;  // Flag to check if the operator is valid

        // Using switch-case to handle different operators
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
            case "/":
                if (second != 0) { // Checking for division by zero
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                validOperator = false;
                break;
        }

        // Check if the operator was valid, if not, print a message
        if (validOperator) {
            System.out.println("Calculation completed.");
        }

        sc.close();
    }
}

