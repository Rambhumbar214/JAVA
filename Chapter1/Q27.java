package Chapter1;

import java.util.Scanner;

public class Q27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of the parallelogram: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the parallelogram: ");
        double height = scanner.nextDouble();

        double area = base * height;

        System.out.printf("Area of the parallelogram is: %.2f%n", area);

        scanner.close();
    }
}