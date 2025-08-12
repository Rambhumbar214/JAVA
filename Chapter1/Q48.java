package Chapter1;

import java.util.Scanner;

public class Q48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("Result: %.2f%n", num1 + num2);
                break;
            case '-':
                System.out.printf("Result: %.2f%n", num1 - num2);
                break;
            case '*':
                System.out.printf("Result: %.2f%n", num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("Result: %.2f%n", num1 / num2);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    System.out.printf("Result: %.2f%n", num1 % num2);
                } else {
                    System.out.println("Error: Modulo by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        scanner.close();
    }
}