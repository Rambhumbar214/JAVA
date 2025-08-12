package Chapter1;

import java.util.Scanner;

public class Q33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.printf("Perimeter of the rectangle is: %.2f%n", perimeter);

        scanner.close();
    }
}