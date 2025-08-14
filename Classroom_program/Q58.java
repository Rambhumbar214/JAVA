package Classroom_program;

public class Q58 {
    int i = 10;  // instance variable of Q58

    public void M1() {
        int i = 20;  // local variable inside M1 (different from instance variable)
    }

    public static void main(String[] args) {
        Q58 t = new Q58();
        System.out.println(t.i);  // Access instance variable i
    }
}
