package Chapter1;

import java.util.Scanner;

public class Q41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the cube: ");
        double side = scanner.nextDouble();

        double lateralSurfaceArea = 4 * side * side;

        System.out.printf("Lateral surface area of the cube is: %.2f%n", lateralSurfaceArea);

        scanner.close();
    }
}