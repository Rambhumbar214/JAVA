package Chapter1;

import java.util.Scanner;

public class Q28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of first diagonal (d1): ");
        double d1 = scanner.nextDouble();

        System.out.print("Enter length of second diagonal (d2): ");
        double d2 = scanner.nextDouble();

        double area = 0.5 * d1 * d2;

        System.out.printf("Area of the rhombus is: %.2f%n", area);

        scanner.close();
    }
}