package Classroom_program;

public class Q82 {
	static int x=20;
    public static void main(String[] args) {
        Q82 t = new Q82();
        Q82 s = new Q82();
        Q82 y = new Q82();

        s.x = t.x + 5;  // s.x = 20 + 5 = 25
        t.x = s.x + 5;  // t.x = 25 + 5 = 30

        System.out.println(s.x);  // prints 30 because s.x and t.x refer to same static variable
    }
}
