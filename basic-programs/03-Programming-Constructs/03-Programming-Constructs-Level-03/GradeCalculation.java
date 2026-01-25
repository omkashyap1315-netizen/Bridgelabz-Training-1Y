import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for the three subjects
        System.out.print("Enter the marks for Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter the marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter the marks for Maths: ");
        double maths = sc.nextDouble();

        // Compute the average mark
        double average = (physics + chemistry + maths) / 3;

        // Determine the grade and remarks
        String grade;
        String remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (average >= 70) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (average >= 60) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (average >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (average >= 40) {
            grade = "E";
            remarks = "(Level 1 -, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        // Output the average and grade with remarks
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}

