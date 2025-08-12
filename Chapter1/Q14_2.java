package Chapter1;
import java.util.Scanner;

public class Q14_2 {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read dimensions of the 3D array
	        System.out.print("Enter number of layers (depth): ");
	        int depth = scanner.nextInt();
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = scanner.nextInt();

	        int[][][] array = new int[depth][rows][cols];

	        // Read elements of the 3D array
	        System.out.println("Enter elements of the 3D array:");
	        for (int d = 0; d < depth; d++) {
	            System.out.println("Layer " + (d + 1) + ":");
	            for (int r = 0; r < rows; r++) {
	                for (int c = 0; c < cols; c++) {
	                    System.out.print("Element [" + d + "][" + r + "][" + c + "]: ");
	                    array[d][r][c] = scanner.nextInt();
	                }
	            }
	        }

	        // Display the 3D array
	        System.out.println("\n3D Array Elements:");
	        for (int d = 0; d < depth; d++) {
	            System.out.println("Layer " + (d + 1) + ":");
	            for (int r = 0; r < rows; r++) {
	                for (int c = 0; c < cols; c++) {
	                    System.out.print(array[d][r][c] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}

