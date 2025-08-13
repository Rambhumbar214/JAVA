package Classroom_program;

public class Construct2 {
	//no argument constructor
	public Construct2() {
		System.out.println("I am in constructor");
	}
	//parameterize constructor
	public Construct2(int a) {
		System.out.println("Value of a"+a);
	}
	public static void main(String[] args) {
		Construct2 x=new Construct2();
		Construct2 a=new Construct2(56);
	}
}

