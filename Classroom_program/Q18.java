package Classroom_program;

public class Q18 {
	public Q18() {
		System.out.println("I am in constructor");
	}
	//parameterize constructor
	public Q18(int a) {
		System.out.println("Value of a"+a);
	}
	public static void main(String[] args) {
		Q18 x=new Q18();
	}
}
