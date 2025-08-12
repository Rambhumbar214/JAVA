package practiceprogram;

class MyNumber {
    private int number;

    // Default constructor
    public MyNumber() {
        this.number = 0;
    }

    // Parameterized constructor
    public MyNumber(int number) {
        this.number = number;
    }

    // Check if number is negative
    public boolean isNegative() {
        return this.number < 0;
    }

    // Check if number is positive
    public boolean isPositive() {
        return this.number > 0;
    }

    // Check if number is odd
    public boolean isOdd() {
        return this.number % 2 != 0;
    }

    // Check if number is even
    public boolean isEven() {
        return this.number % 2 == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            int value = Integer.parseInt(args[0]);
            MyNumber myNum = new MyNumber(value);

            System.out.println("Number: " + value);
            System.out.println("Is Positive? " + myNum.isPositive());
            System.out.println("Is Negative? " + myNum.isNegative());
            System.out.println("Is Odd? " + myNum.isOdd());
            System.out.println("Is Even? " + myNum.isEven());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}