package assignment3;

import java.io.*;
import java.util.*;

public class A3SCQ1 {

    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Load (Generate 10 random 2-digit numbers)");
            System.out.println("2. Save (Write numbers to 'number.txt')");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loadNumbers();
                    break;
                case 2:
                    saveNumbersToFile("number.txt");
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        scanner.close();
    }

   
    public static void loadNumbers() {
        Random rand = new Random();
        numbers.clear();
        System.out.println("Generated Numbers:");
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(90) + 10; // Range: 10 to 99
            numbers.add(num);
            System.out.print(num + " ");
        }
        System.out.println();
    }

   
    public static void saveNumbersToFile(String filename) {
        if (numbers.isEmpty()) {
            System.out.println("No numbers to save. Please load first.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int num : numbers) {
                writer.write(num + " ");
            }
            System.out.println("Numbers saved to '" + filename + "'");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}