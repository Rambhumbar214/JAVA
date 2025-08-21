package assignment1;
import java.io.*;

public class A1SAQ1{
    public static void main(String[] args) throws IOException {
        // Create BufferedReader to read input from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.print("Enter a number to generate its multiplication table: ");

        // Read input as String and convert it to integer
        String input = reader.readLine();
        int number = Integer.parseInt(input);

       
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
