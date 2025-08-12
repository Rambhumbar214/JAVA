package Chapter1;

import java.util.Scanner;

public class Q36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the cone: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter height of the cone: ");
        double height = scanner.nextDouble();

        double volume = (1.0 / 3) * Math.PI * radius * radius * height;

        System.out.printf("Volume of the cone is: %.2f%n", volume);

        scanner.close();
    }
}