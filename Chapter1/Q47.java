package Chapter1;

import java.util.Scanner;

public class Q47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total runs scored: ");
        int totalRuns = scanner.nextInt();

        System.out.print("Enter number of times out: ");
        int timesOut = scanner.nextInt();

        if (timesOut == 0) {
            System.out.println("Batting average is undefined (never out).");
        } else {
            double battingAverage = (double) totalRuns / timesOut;
            System.out.printf("Batting Average: %.2f%n", battingAverage);
        }

        scanner.close();
    }
}