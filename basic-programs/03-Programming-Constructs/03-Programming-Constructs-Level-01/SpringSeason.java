public class SpringSeason {
    public static void main(String[] args) {
        // Check if the correct number of arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide month and day as arguments.");
            return;
        }

        try {
            // Parse the month and day from the command line arguments
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);

            // Check if the date falls within the Spring season
            if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers for month and day.");
        }
    }
}

