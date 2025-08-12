package Chapter1;

import java.util.Scanner;

public class Q45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = 100 * 1.50 + (units - 100) * 2.50;
        } else if (units <= 300) {
            bill = 100 * 1.50 + 100 * 2.50 + (units - 200) * 4.00;
        } else {
            bill = 100 * 1.50 + 100 * 2.50 + 100 * 4.00 + (units - 300) * 5.00;
        }

        System.out.printf("Electricity bill for %d units is: ₹%.2f%n", units, bill);

        scanner.close();
    }
}