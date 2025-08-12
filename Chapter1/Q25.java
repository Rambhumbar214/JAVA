package Chapter1;

import java.util.Scanner;

public class Q25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.printf("Area of the rectangle is: %.2f%n", area);

        scanner.close();
    }
}