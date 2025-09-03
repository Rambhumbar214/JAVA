package assignment3;

import java.io.*;
import java.util.Scanner;

public class A3SBQ3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "customer_data.dat";

        try {
           
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
            System.out.print("Enter number of customers: ");
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for Customer " + (i + 1));
                System.out.print("Customer ID: ");
                int c_id = Integer.parseInt(scanner.nextLine());

                System.out.print("Customer Name: ");
                String cname = scanner.nextLine();

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.print("Mobile No: ");
                String mobile_no = scanner.nextLine();

                // Write to file
                dos.writeInt(c_id);
                dos.writeUTF(cname);
                dos.writeUTF(address);
                dos.writeUTF(mobile_no);
            }
            dos.close();

            
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
            System.out.println("\n--- Customer Details from File ---");
            for (int i = 0; i < n; i++) {
                int c_id = dis.readInt();
                String cname = dis.readUTF();
                String address = dis.readUTF();
                String mobile_no = dis.readUTF();

                System.out.println("\nCustomer " + (i + 1));
                System.out.println("ID: " + c_id);
                System.out.println("Name: " + cname);
                System.out.println("Address: " + address);
                System.out.println("Mobile No: " + mobile_no);
            }
            dis.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format.");
        }

        scanner.close();
    }
}