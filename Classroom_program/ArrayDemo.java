package JavaPrograms;

public class ArrayDemo {
	public void add(int x,int y) {
		int r=x+y;
		System.out.println("add is" +r);
	}
	public static void main(String[] args) {
		ArrayDemo d=new ArrayDemo();
		d.add(5, 6);
	}
}
