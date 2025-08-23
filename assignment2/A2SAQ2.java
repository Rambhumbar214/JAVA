package assignment2;
import java.util.Scanner;

import series.FibonacciSeries;
import series.CubeSeries;
import series.SquareSeries;
public class A2SAQ2 {


	

	
	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	         System.out.print("Enter the number of terms (n): ");
	         int n = scanner.nextInt();


	        FibonacciSeries fib = new FibonacciSeries();
	        CubeSeries cube = new CubeSeries();
	        SquareSeries square = new SquareSeries();

	        fib.printFibonacci(n);
	        cube.printCubes(n);
	        square.printSquares(n);
	        
	        scanner.close();

	    }
	}

