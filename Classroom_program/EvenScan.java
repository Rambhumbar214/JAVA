package JavaPrograms;
import java.util.Scanner;
public class EvenScan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number:");
    	 int x=sc.nextInt();
    	 if(x%2==0) {
    		 System.out.println("Number is Even");
     }else {
    	 System.out.println("Number is odd");
     }
	}
}
