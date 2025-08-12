package practiceprogram;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private float percentage;

    // Default constructor
    public Student() {
        this.rollNo = 0;
        this.name = "Unknown";
        this.percentage = 0.0f;
    }

    // Parameterized constructor
    public Student(int rollNo, String name, float percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    // Method to accept student details
    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Roll No: ");
        this.rollNo = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Percentage: ");
        this.percentage = sc.nextFloat();
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Percentage: " + this.percentage + "%");
        System.out.println("--------------------------");
    }
}

public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        System.out.println("Enter details for 5 students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i] = new Student(); // Using default constructor
            students[i].acceptDetails(sc);
        }

        System.out.println("\nDisplaying student details:");
        for (Student s : students) {
            s.displayDetails();
        }

        sc.close();
    }
}