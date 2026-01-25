import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt();

        // Check if the employee is eligible for a bonus (more than 5 years of service)
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  // 5% bonus
        }

        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        sc.close();
    }
}

