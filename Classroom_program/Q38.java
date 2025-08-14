package Classroom_program;
import java.util.Scanner;
public class Q38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Step 1: Input - get number from user
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        long factorial = 1;
		        for (int i = 1; i <= num; i++) {
		            factorial *= i;
		        }
		        System.out.println("Factorial of " + num + " is: " + factorial);
		}
}
