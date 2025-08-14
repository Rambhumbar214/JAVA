package Classroom_program;
import java.util.Scanner;
public class Q72 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();
		        int original = number;
		        int reversed = 0;
		        for (; number != 0; number = number / 10) {
		            int digit = number % 10;
		            reversed = reversed * 10 + digit;
		        }
		        if (original == reversed) {
		            System.out.println(original + " is a palindrome.");
		        } else {
		            System.out.println(original + " is not a palindrome.");
		        }

		        scanner.close();
		    }
	}
