package practiceprogram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Product {
    int id;
    String name;
    double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: ₹" + price);
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Input details for 5 products
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter details for Product " + (i + 1) + ":");

                System.out.print("ID: ");
                int id = Integer.parseInt(reader.readLine());

                System.out.print("Name: ");
                String name = reader.readLine();

                System.out.print("Price: ");
                double price = Double.parseDouble(reader.readLine());

                products[i] = new Product(id, name, price);
            }

            // Display all products
            System.out.println("\nProduct Details:");
            for (Product p : products) {
                p.display();
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input. Please enter correct data.");
        }
    }
}