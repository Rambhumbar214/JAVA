package assignment2;
import java.util.*;

// Abstract class Staff
abstract class Staff {
    protected String name;
    protected String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract double calculateSalary();

    public abstract void displayDetails();
}

// FullTimeStaff subclass
class FullTimeStaff extends Staff {
    private String department;
    private double salary;
    private double hra;
    private double da;

    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
        this.hra = 0.08 * salary;
        this.da = 0.05 * salary;
    }

    @Override
    public double calculateSalary() {
        return salary + hra + da;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Full-Time Staff ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Base Salary: ₹" + salary);
        System.out.println("HRA (8%): ₹" + hra);
        System.out.println("DA (5%): ₹" + da);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

// PartTimeStaff subclass
class PartTimeStaff extends Staff {
    private int hours;
    private double rate;

    public PartTimeStaff(String name, String address, int hours, double rate) {
        super(name, address);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return hours * rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Part-Time Staff ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Rate per Hour: ₹" + rate);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

// ✅ Main class renamed to A2SBQ3
public class A2SBQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Staff> staffList = new ArrayList<>();

        System.out.print("Enter number of staff members: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Staff #" + (i + 1));
            System.out.print("Is this Full-Time or Part-Time? (F/P): ");
            char type = sc.nextLine().toUpperCase().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();

            if (type == 'F') {
                System.out.print("Department: ");
                String dept = sc.nextLine();
                System.out.print("Base Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); // consume newline
                staffList.add(new FullTimeStaff(name, address, dept, salary));
            } else if (type == 'P') {
                System.out.print("Number of Hours: ");
                int hours = sc.nextInt();
                System.out.print("Rate per Hour: ");
                double rate = sc.nextDouble();
                sc.nextLine(); // consume newline
                staffList.add(new PartTimeStaff(name, address, hours, rate));
            } else {
                System.out.println("Invalid type. Skipping this entry.");
            }
        }

        // Display all staff details
        System.out.println("\n=== Staff Details ===");
        for (Staff s : staffList) {
            s.displayDetails();
        }

        sc.close();
    }
}