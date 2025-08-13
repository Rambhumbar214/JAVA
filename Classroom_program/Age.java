package Classroom_program;

import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a age:\n" );
    int a=sc.nextInt();
    if(a>0 && a<18) {
    	System.out.println("You are a Kid \n");
    }
    else if(a>18 && a<60) {
    	System.out.println("you are a Adult \n");
    }
    else if(a>=60 && a<=100) {
    	System.out.println("You are a Seniour Citizen");
    }
    else {
    	System.out.println("Invalid Input");
    }
 }
}


