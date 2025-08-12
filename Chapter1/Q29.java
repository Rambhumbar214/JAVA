package Chapter1;

import java.util.Scanner;

public class Q29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the equilateral triangle: ");
        double a = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4) * a * a;

        System.out.printf("Area of the equilateral triangle is: %.2f%n", area);

        scanner.close();
    }
}