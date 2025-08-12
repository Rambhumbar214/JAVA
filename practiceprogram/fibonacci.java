package practiceprogram;
public class fibonacci {
    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Check if a number is provided
        if (args.length != 1) {
            System.out.println("Usage: java FibonacciRecursive <count>");
            return;
        }

        try {
            int count = Integer.parseInt(args[0]);

            if (count <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            System.out.println("Fibonacci series up to " + count + " terms:");
            for (int i = 0; i < count; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}