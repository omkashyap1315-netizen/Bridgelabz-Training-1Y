import java.util.Scanner;

public class LeapYearSingleIfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is valid (greater than or equal to 1582)
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

