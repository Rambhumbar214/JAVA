package Chapter1;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        

	  Scanner scanner = new Scanner(System.in);

      // Read array size
      System.out.print("Enter size of the array: ");
      int size = scanner.nextInt();
      int[] array = new int[size];

      // Read array elements
      System.out.println("Enter elements of the array:");
      for (int i = 0; i < size; i++) {
          array[i] = scanner.nextInt();
      }

      // Print even numbers
      System.out.println("Even numbers in the array:");
      for (int num : array) {
          if (num % 2 == 0) {
              System.out.print(num + " ");
          }
      }

      // Print odd numbers
      System.out.println("\nOdd numbers in the array:");
      for (int num : array) {
          if (num % 2 != 0) {
              System.out.print(num + " ");
          }
      }

      scanner.close();

    }



		

}
