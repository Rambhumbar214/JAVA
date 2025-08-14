package Classroom_program;

public class Q69 {
    int x = 20;

    public static void main(String[] args) {
        Q69 t = new Q69();
        Q69 s = new Q69();
        Q69 y = new Q69();

        s.x = t.x + 5;  // s.x = 20 + 5 = 25
        t.x = s.x + 5;  // t.x = 25 + 5 = 30

        System.out.println(t.x);  // prints 30
    }
}
