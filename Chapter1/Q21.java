package Chapter1;

import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();

        double[] gradePoints = new double[n];
        int[] credits = new int[n];

        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade point for subject " + (i + 1) + ": ");
            gradePoints[i] = scanner.nextDouble();

            System.out.print("Enter credit hours for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();

            totalGradePoints += gradePoints[i] * credits[i];
            totalCredits += credits[i];
        }

        double cgpa = totalGradePoints / totalCredits;

        System.out.printf("Your CGPA is: %.2f%n", cgpa);

        scanner.close();
    }
}