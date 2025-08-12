package Chapter1;

import java.util.Scanner;

public class Q40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base area of the prism: ");
        double baseArea = scanner.nextDouble();

        System.out.print("Enter height of the prism: ");
        double height = scanner.nextDouble();

        double volume = baseArea * height;

        System.out.printf("Volume of the prism is: %.2f%n", volume);

        scanner.close();
    }
}