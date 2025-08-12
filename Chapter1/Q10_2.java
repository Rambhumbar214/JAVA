package Chapter1;
import java.util.Scanner;
public class Q10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        double average = (a + b + c) / 3;

        System.out.println("Average is: " + average);
        if(average==100)
        {
        	System.out.println("O+ Grade");
        
        }
        else if(average>=90)
        {
        	System.out.println("O Grade");
        }
        else if(average>=80)
        {
        	System.out.println("A+ Grade");
      
        }
        else if(average>=75)
        {
        	System.out.println("A Grade");
        }
        else if(average>=70)
        {
        	System.out.println("B+ Grade");
        }
        else if(average>=65)
        {
        	System.out.println("B Grade");
        }
        else if(average>=60)
        {
        	System.out.println("C+ Grade");
        }
        else if(average>=55)
        {
        	System.out.println("C Grade");
        }
        else if(average>=50)
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("Fail");
        }
        sc.close();
	}

}
