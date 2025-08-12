package practiceprogram;
public class Multiplicationtable {
    public static void main(String[] args) {
        // Check if a number is provided
        if (args.length != 1) {
            System.out.println("Usage: java MultiplicationTable <number>");
            return;
        }

        try {
            // Parse the number from command line argument
            int number = Integer.parseInt(args[0]);

            // Generate and print the multiplication table
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}