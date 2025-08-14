package Classroom_program;
public class Q2 extends Q1 {
	public static void main(String[] args) {
		Q2 obj = new Q2();
		int sum = obj.a + obj.b;  // accessing inherited variables
		System.out.println("The Result is " + sum);
	}
}
