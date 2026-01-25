import java.util.Scanner;

public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for age and height of the three friends
        System.out.print("Enter the age of Amar: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter the height of Amar: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter the age of Akbar: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter the height of Akbar: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter the age of Anthony: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter the height of Anthony: ");
        double anthonyHeight = sc.nextDouble();

        // Finding the youngest friend by comparing ages
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Finding the tallest friend by comparing heights
        double tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " meters.");

        sc.close();
    }
}

