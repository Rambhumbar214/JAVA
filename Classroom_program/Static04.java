package Classroom_program;


public class Static04 {
	static int x=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static04 t=new Static04();
		Static04 s=new Static04();
		Static04 y=new Static04();
		s.x=t.x+5;
		t.x=s.x+5;
		System.out.println(s.x);

	}
}

