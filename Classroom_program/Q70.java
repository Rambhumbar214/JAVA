package Classroom_program;

public class Q70 {
    int x = 20;

    public static void main(String[] args) {
        Q70 t = new Q70();
        Q70 s = new Q70();
        Q70 y = new Q70();

        // Cannot do: x = x + 5; (static context cannot access instance variable)
        // So do:
        t.x = t.x + 5;     // t.x = 20 + 5 = 25
        t.x = s.x + 5;     // t.x = s.x + 5 = 20 + 5 = 25 (s.x is 20)
        
        System.out.println(t.x);  // prints 25
    }
}
