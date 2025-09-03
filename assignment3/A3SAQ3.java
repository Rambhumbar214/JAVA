package assignment3;

import java.util.Scanner;


class ZeroNumberException extends Exception {
    public ZeroNumberException(String message) {
        super(message);
    }
}

public class A3SAQ3 {
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number == 0) {
                throw new ZeroNumberException("Number is 0");
            }

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
            }

        } catch (ZeroNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        scanner.close();
    }
}