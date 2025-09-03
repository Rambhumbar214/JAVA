package assignment3;

import java.util.Scanner;


class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class A3SBQ2 {

    
    public static void validateDoctorName(String name) throws InvalidNameException {
        
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new InvalidNameException("Name is Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Doctor's Name: ");
        String doctorName = scanner.nextLine();

        try {
            validateDoctorName(doctorName);
            System.out.println("Doctor's Name is: " + doctorName);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}