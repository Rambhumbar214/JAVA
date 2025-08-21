package assignment1;
public class A1SAQ2 {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        // Parse the command line argument to integer
        int number = Integer.parseInt(args[0]);
        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;          // Get the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            number = number / 10;             // Remove last digit
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversed);
    }
}
