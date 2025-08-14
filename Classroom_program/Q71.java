package Classroom_program;

public class Q71 {
    int x = 20;

    public static void main(String[] args) {
        Q71 t = new Q71();
        Q71 s = new Q71();
        Q71 y = new Q71();

        s.x = t.x + 5;  // s.x = 20 + 5 = 25
        System.out.println(s.x);  // prints 25
    }
}
