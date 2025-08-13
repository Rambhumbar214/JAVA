package JavaPrograms;

public class Construct1 {
	public Construct1() {
		System.out.println("I am in constructor");
	}
	//parameterize constructor
	public Construct1(int a) {
		System.out.println("Value of a"+a);
	}
	public static void main(String[] args) {
		Construct1 x=new Construct1();
	}
}
