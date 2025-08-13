package JavaPrograms;

public class Object {
	int x=20;
	public static void main(String[] args) {
	Object t=new Object();	
	Object s=new Object();	
	Object y=new Object();	
    s.x=t.x+5;
    System.out.println(s.x);
	}
}
