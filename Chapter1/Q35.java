package Chapter1;

import java.util.Scanner;

public class Q35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the rhombus: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;

        System.out.printf("Perimeter of the rhombus is: %.2f%n", perimeter);

        scanner.close();
    }
}