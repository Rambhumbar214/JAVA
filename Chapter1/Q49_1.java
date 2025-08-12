package Chapter1;

import java.util.Scanner;

public class Q49_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("\nAscending Order:");
        int i = start;
        while (i <= end) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\nDescending Order:");
        int j = end;
        while (j >= start) {
            System.out.print(j + " ");
            j--;
        }

        scanner.close();
    }
}