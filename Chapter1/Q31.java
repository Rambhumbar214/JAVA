package Chapter1;

import java.util.Scanner;

public class Q31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the equilateral triangle: ");
        double a = scanner.nextDouble();

        double perimeter = 3 * a;

        System.out.printf("Perimeter of the equilateral triangle is: %.2f%n", perimeter);

        scanner.close();
    }
}