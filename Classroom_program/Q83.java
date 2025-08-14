package Classroom_program;

public class Q83 {
	static int x=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Q83 t=new Q83();
		Q83 s=new Q83();
		Q83 y=new Q83();
		s.x=t.x+5;
		t.x=s.x+5;
		y.x=s.x+t.x;
		System.out.println(t.x);

	}
}
