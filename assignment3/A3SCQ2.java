package assignment3;

import java.util.Scanner;

public class A3SCQ2 {

  
    static class InvalidDateException extends Exception {
        public InvalidDateException(String message) {
            super(message);
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month, year;

        System.out.print("Enter day (dd): ");
        day = sc.nextInt();
        System.out.print("Enter month (mm): ");
        month = sc.nextInt();
        System.out.print("Enter year (yyyy): ");
        year = sc.nextInt();

        try {
            validateDate(day, month, year);
            displayDate(day, month, year);
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    public static void validateDate(int day, int month, int year) throws InvalidDateException {
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Invalid month: " + month);
        }

        int[] daysInMonth = {
            31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (day < 1 || day > daysInMonth[month - 1]) {
            throw new InvalidDateException("Invalid day: " + day + " for month: " + month + " and year: " + year);
        }
    }

    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

   
    public static void displayDate(int day, int month, int year) {
        System.out.printf("Valid Date: %02d/%02d/%04d\n", day, month, year);
    }
}