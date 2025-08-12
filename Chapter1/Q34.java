package Chapter1;

import java.util.Scanner;

public class Q34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the square: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;

        System.out.printf("Perimeter of the square is: %.2f%n", perimeter);

        scanner.close();
    }
}