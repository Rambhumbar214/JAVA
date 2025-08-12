package Chapter1;

import java.util.Scanner;

public class Q49_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("\nAscending Order:");
        int i = start;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= end);

        System.out.println("\n\nDescending Order:");
        int j = end;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= start);

        scanner.close();
    }
}