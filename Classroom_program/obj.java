package Classroom_program;


public class obj {
	int x=20;

	public static void main(String[] args) {
		obj t=new obj();	
		obj s=new obj();	
		obj y=new obj();
		s.x=t.x+5;
		t.x=s.x+5;
		System.out.println(t.x);

	}
}

