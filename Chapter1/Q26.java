package Chapter1;

import java.util.Scanner;

public class Q26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of equal sides (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter base of the triangle (b): ");
        double b = scanner.nextDouble();

        double area = (b / 4.0) * Math.sqrt(4 * a * a - b * b);

        System.out.printf("Area of the isosceles triangle is: %.2f%n", area);

        scanner.close();
    }
}