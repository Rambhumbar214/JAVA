package Chapter1;

import java.util.Scanner;

public class Q39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Volume of the sphere is: %.2f%n", volume);

        scanner.close();
    }
}