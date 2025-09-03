package assignment3;

import java.util.Scanner;
import java.util.TreeSet;

public class A3SAQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num); 
        }

      
        System.out.println("Sorted unique integers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

     
        System.out.print("\nEnter an integer to search: ");
        int searchElement = scanner.nextInt();

        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is present in the collection.");
        } else {
            System.out.println(searchElement + " is NOT present in the collection.");
        }

        scanner.close();
    }
}