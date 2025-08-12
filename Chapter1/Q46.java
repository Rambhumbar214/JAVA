package Chapter1;

import java.util.Scanner;

public class Q46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original price of the product: ₹");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discountAmount = (discountPercent / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;

        System.out.printf("Discount Amount: ₹%.2f%n", discountAmount);
        System.out.printf("Final Price after discount: ₹%.2f%n", finalPrice);

        scanner.close();
    }
}