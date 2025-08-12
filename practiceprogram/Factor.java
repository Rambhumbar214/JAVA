package practiceprogram;

public class Factor {



    public static void main(String[] args) {
        // Check if a number is provided
        if (args.length != 1) {
            System.out.println("Usage: java FactorPrinter <number>");
            return;
        }

        try {
            // Parse the number from command line argument
            int number = Integer.parseInt(args[0]);

            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            // Print the factors
            System.out.println("Factors of " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}