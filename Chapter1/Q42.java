package Chapter1;

import java.util.Scanner;

public class Q42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();

        double totalSurfaceArea = 2 * Math.PI * radius * (height + radius);

        System.out.printf("Total surface area of the cylinder is: %.2f%n", totalSurfaceArea);

        scanner.close();
    }
}