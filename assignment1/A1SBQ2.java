package assignment1;
import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class A1SBQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] empArray = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume leftover newline
            empArray[i] = new Employee(name, salary);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 5; i++) {
            empArray[i].display();
        }
    }
}
