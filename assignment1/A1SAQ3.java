package assignment1;
import java.util.Arrays;
import java.util.Scanner;
public class A1SAQ3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();
	        int[] numbers = new int[size];

	        System.out.println("Enter " + size + " integer values:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }

	        Arrays.sort(numbers);

	        System.out.println("\nSorted Array in Ascending Order:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\n\nSum of array elements: " + sum);
	    }
	}


