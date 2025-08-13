package JavaPrograms;

public class Static05 {
	static int x=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static05 t=new Static05();
		Static05 s=new Static05();
		Static05 y=new Static05();
		s.x=t.x+5;
		t.x=s.x+5;
		y.x=s.x+t.x;
		System.out.println(t.x);

	}
}
