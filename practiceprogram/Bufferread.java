package practiceprogram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bufferread{

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            // Create BufferedReader to read input from user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            int limit = Integer.parseInt(reader.readLine());

            if (limit < 2) {
                System.out.println("There are no prime numbers less than 2.");
                return;
            }

            System.out.println("Prime numbers up to " + limit + ":");
            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}