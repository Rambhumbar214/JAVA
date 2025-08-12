package Chapter1;
import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Leap year conditions
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a Leap Year.");
	        } else {
	            System.out.println(year + " is Not a Leap Year.");
	        }

	        scanner.close();

	}

}

