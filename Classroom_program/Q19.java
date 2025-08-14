package Classroom_program;

public class Q19 {
	// No-argument constructor
	public Q19() {
		System.out.println("I am in constructor");
	}

	// Parameterized constructor
	public Q19(int a) {
		System.out.println("Value of a: " + a);
	}

	public static void main(String[] args) {
		Q19 x = new Q19();       // Calls no-arg constructor
		Q19 a = new Q19(56);     // Calls parameterized constructor
	}
}
