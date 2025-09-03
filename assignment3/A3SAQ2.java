package assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A3SAQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> employeeSalaries = new HashMap<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter salary for " + name + ": ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            employeeSalaries.put(name, salary);
        }

        System.out.println("\nEmployee Salary Details:");
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Salary: ₹" + entry.getValue());
        }

       
        System.out.print("\nEnter employee name to search: ");
        String searchName = scanner.nextLine();

        if (employeeSalaries.containsKey(searchName)) {
            System.out.println("Salary of " + searchName + " is ₹" + employeeSalaries.get(searchName));
        } else {
            System.out.println(searchName + " not found in the records.");
        }

        scanner.close();
    }
}