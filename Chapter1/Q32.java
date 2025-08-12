package Chapter1;

import java.util.Scanner;

public class Q32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of the parallelogram: ");
        double base = scanner.nextDouble();

        System.out.print("Enter side of the parallelogram: ");
        double side = scanner.nextDouble();

        double perimeter = 2 * (base + side);

        System.out.printf("Perimeter of the parallelogram is: %.2f%n", perimeter);

        scanner.close();
    }
}