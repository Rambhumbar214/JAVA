package assignment2;

import java.util.Scanner;
import utility.CapitalString;

public class A2SAQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CapitalString cs = new CapitalString();

        System.out.print("Enter person's name: ");
        String name = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        // Capitalize name using utility class
        String capitalizedName = cs.capitalizeFirstLetter(name);

        // Create Person object with capitalized name
        Person p = new Person(capitalizedName, city);

        System.out.println("\nPerson Details:");
        p.display();

        sc.close();
    }
}