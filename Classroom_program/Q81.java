package Classroom_program;

public class Q81 {
    static int x = 20;
    int p = 100;

    public static void main(String[] args) {
        Q81 t = new Q81();
        System.out.println(t.p);             // prints 50
        System.out.println(new Q81().p); // prints 50 again
    }
}
