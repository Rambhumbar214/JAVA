package assignment2;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        id = 0;
        name = "";
        salary = 0.0;
    }

    // Accept employee details
    public void accept(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    // Display employee details
    public void display() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    // Default constructor
    Manager() {
        super();
        bonus = 0.0;
    }

    // Accept manager details
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    // Display manager details
    public void display() {
        super.display();
        System.out.println("Bonus        : " + bonus);
        System.out.println("Total Salary : " + getTotalSalary());
    }

    // Get total salary
    public double getTotalSalary() {
        return salary + bonus;
    }
}

public class A2SAQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();

        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Manager " + (i + 1));
            managers[i] = new Manager();
            managers[i].accept(sc);
        }

        // Find manager with max total salary
        int maxIndex = 0;
        double maxSalary = managers[0].getTotalSalary();

        for (int i = 1; i < n; i++) {
            double total = managers[i].getTotalSalary();
            if (total > maxSalary) {
                maxSalary = total;
                maxIndex = i;
            }
        }

        System.out.println("\nManager with Maximum Total Salary:");
        managers[maxIndex].display();

        sc.close();
    }
}