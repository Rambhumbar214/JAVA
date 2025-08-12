package practiceprogram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sumofarray {
    public static void main(String[] args) {
        try {
            // Create BufferedReader to read input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Ask for array size
            System.out.print("Enter the number of elements in the array: ");
            int size = Integer.parseInt(reader.readLine());

            int[] array = new int[size];
            int sum = 0;

            // Read array elements
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(reader.readLine());
                sum += array[i];
            }

            // Display the sum
            System.out.println("Sum of array elements: " + sum);

        } catch (IOException e) {
            System.out.println("Error reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}