import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Part 1: Multiple if-else conditions
        if (year >= 1582) {  // Check if the year is valid (Gregorian calendar starts from 1582)
            if (year % 4 == 0) {  // Year is divisible by 4
                if (year % 100 == 0) {  // Year is divisible by 100
                    if (year % 400 == 0) {  // Year is divisible by 400
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year should be greater than or equal to 1582.");
        }

        // Part 2: Using a single if statement with logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            if (year >= 1582) {
                System.out.println(year + " is not a Leap Year.");
            } else {
                System.out.println("Year should be greater than or equal to 1582.");
            }
        }

        sc.close();
    }
}

