public class DayOfWeek {
    public static void main(String[] args) {
        // Ensure we have 3 command-line arguments
        if (args.length != 3) {
            System.out.println("Please provide 3 arguments: month (m), day (d), and year (y).");
            return;
        }

        // Parse the arguments as integers
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Apply the formula for y0
        int y0 = y - (14 - m) / 12;

        // Apply the formula for x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Apply the formula for m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Apply the formula for d0
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}

