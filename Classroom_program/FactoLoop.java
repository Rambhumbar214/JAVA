package Classroom_program;

import java.util.Scanner;
public class FactoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		  
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a non-negative integer: ");
		 int number = scanner.nextInt();
		        int i = 1;
		        long factorial = 1;
		        if (number < 0) {
		 System.out.println("Factorial is not defined for negative numbers.");
		        } else {
		            do {
		         factorial *= i;
		                i++;
		            } while (i <= number);
		            System.out.println("Factorial of " + number + " is: " + factorial);
		        }
		        scanner.close();
		    }
	}

