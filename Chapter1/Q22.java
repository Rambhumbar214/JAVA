package Chapter1;

public class Q22 {
    String name;
    int age;

    // Constructor
    public Q22(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Q22 person = new Q22("Amit", 25);
        person.display();
    }
}