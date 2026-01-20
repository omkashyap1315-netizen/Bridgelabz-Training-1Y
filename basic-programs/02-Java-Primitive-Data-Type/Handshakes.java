import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        int numberOfStudents;
        int handshakes;

        Scanner input = new Scanner(System.in);

        numberOfStudents = input.nextInt();

        handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println(
            "The maximum number of possible handshakes is " + handshakes
        );

        input.close();
    }
}
