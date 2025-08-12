package Chapter1;
import java.util.Scanner;

public class Q14_1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read size of first array
	        System.out.print("Enter size of first array: ");
	        int size1 = scanner.nextInt();
	        int[] array1 = new int[size1];

	        System.out.println("Enter elements of first array:");
	        for (int i = 0; i < size1; i++) {
	            array1[i] = scanner.nextInt();
	        }

	        // Read size of second array
	        System.out.print("Enter size of second array: ");
	        int size2 = scanner.nextInt();
	        int[] array2 = new int[size2];

	        System.out.println("Enter elements of second array:");
	        for (int i = 0; i < size2; i++) {
	            array2[i] = scanner.nextInt();
	        }

	        // Display second array
	        System.out.println("Second array elements are:");
	        for (int i = 0; i < size2; i++) {
	            System.out.print(array2[i] + " ");
	        }

	        scanner.close();
	    }

}
