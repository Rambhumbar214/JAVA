package assignment1;
import java.util.Scanner;

class MyDate {
    private int day, month, year;

    public MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter day: ");
        day = sc.nextInt();
        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
    }

    public void display() {
        System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
    }
}

public class A1SCQ1 {
    private int id;
    private String name;
    private MyDate dob;
    private static int cnt = 1;

    public A1SCQ1() {
        this.id = cnt++;
        this.name = "";
        this.dob = new MyDate();
    }

    public A1SCQ1(String name, MyDate dob) {
        this.id = cnt++;
        this.name = name;
        this.dob = dob;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        dob = new MyDate();
        dob.accept(sc);
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        dob.display();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        A1SCQ1[] persons = new A1SCQ1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            persons[i] = new A1SCQ1();
            persons[i].accept(sc);
        }

        System.out.println("\n--- Person Details ---");
        for (A1SCQ1 p : persons) {
            p.display();
            System.out.println("----------------------");
        }
    }
}
