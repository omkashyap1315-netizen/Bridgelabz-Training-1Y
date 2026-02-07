package JavaArrays.Level1;
import java.util.Scanner;

    public class VotingEligibility {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // a. Define an array of 10 integer elements
            int[] ages = new int[10];

            // Take user input
            System.out.println("Enter the age of 10 students:");
            for (int i = 0; i < ages.length; i++) {
                ages[i] = sc.nextInt();
            }

            // b. Loop through the array and check voting eligibility
            for (int i = 0; i < ages.length; i++) {

                if (ages[i] < 0) {
                    System.out.println("Invalid age");
                }
                else if (ages[i] >= 18) {
                    System.out.println("The student with the age " + ages[i] + " can vote.");
                }
                else {
                    System.out.println("The student with the age " + ages[i] + " cannot vote.");
                }
            }

            sc.close();
        }
    }
