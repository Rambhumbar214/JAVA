package Chapter1;

import java.util.Scanner;

public class Q38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.printf("Volume of the cylinder is: %.2f%n", volume);

        scanner.close();
    }
}