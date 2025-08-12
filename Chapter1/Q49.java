package Chapter1;

import java.util.Scanner;

public class Q49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("\nAscending Order:");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nDescending Order:");
        for (int i = end; i >= start; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}