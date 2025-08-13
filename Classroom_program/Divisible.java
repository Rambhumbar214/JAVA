package Classroom_program;

import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:\n" );
		  int a=sc.nextInt();
			  if(a%3==0 && a%5==0) {
			  System.out.println("Number is Divisible by 3 and 5 \n");
			  }
			  else if(a%5==0) {
			  System.out.println("Number is Divisible by 5 \n");
			  }
			  else if(a%3==0) {
			  System.out.println("Number is Divisible by 3");
			 }
			 else {
			System.out.println("Invalid Input");
		}
	}

}

