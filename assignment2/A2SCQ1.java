package assignment2;

import java.util.Scanner;



	interface CreditCardInterface {
	    void viewCreditAmount();
	    void useCard(double amount);
	    void payCredit(double amount);
	    void increaseLimit(double amount);
	}

	class SilverCardCustomer implements CreditCardInterface {
	    protected String name;
	    protected String cardNumber;
	    protected double creditAmount;
	    protected double creditLimit;

	    public SilverCardCustomer(String name, String cardNumber) {
	        this.name = name;
	        this.cardNumber = cardNumber;
	        this.creditAmount = 0;
	        this.creditLimit = 50000;
	    }

	    public void viewCreditAmount() {
	        System.out.println("Current Credit Used: ₹" + creditAmount);
	        System.out.println("Remaining Limit: ₹" + (creditLimit - creditAmount));
	    }

	    public void useCard(double amount) {
	        if (creditAmount + amount <= creditLimit) {
	            creditAmount += amount;
	            System.out.println("Transaction Approved. ₹" + amount + " used.");
	        } else {
	            System.out.println("Transaction Declined. Limit Exceeded.");
	        }
	    }

	    public void payCredit(double amount) {
	        if (amount <= creditAmount) {
	            creditAmount -= amount;
	            System.out.println("₹" + amount + " credited back. Payment Successful.");
	        } else {
	            System.out.println("Payment amount exceeds used credit.");
	        }
	    }

	    public void increaseLimit(double amount) {
	        System.out.println("Silver card holders cannot increase credit limit.");
	    }
	}

	class GoldCardCustomer extends SilverCardCustomer {
	    private int increaseCount;

	    public GoldCardCustomer(String name, String cardNumber) {
	        super(name, cardNumber);
	        this.creditLimit = 100000;
	        this.increaseCount = 0;
	    }

	    @Override
	    public void increaseLimit(double amount) {
	        if (increaseCount < 3 && amount <= 5000) {
	            creditLimit += amount;
	            increaseCount++;
	            System.out.println("Credit limit increased by ₹" + amount + ". New limit: ₹" + creditLimit);
	        } else if (increaseCount >= 3) {
	            System.out.println("Limit increase failed. Maximum of 3 increases reached.");
	        } else {
	            System.out.println("Limit increase failed. Amount exceeds ₹5000.");
	        }
	    }
	}

	
	public class A2SCQ1 {
	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        SilverCardCustomer silver = new SilverCardCustomer("Alice", "1234567812345678");
		        GoldCardCustomer gold = new GoldCardCustomer("Bob", "8765432187654321");

		        System.out.println("=== SILVER CARD OPERATIONS ===");
		        silver.viewCreditAmount();
		        silver.useCard(10000);
		        silver.payCredit(3000);
		        silver.increaseLimit(2000); // should fail
		        silver.viewCreditAmount();

		        System.out.println("\n=== GOLD CARD OPERATIONS ===");
		        gold.viewCreditAmount();
		        gold.useCard(20000);
		        gold.payCredit(5000);
		        gold.increaseLimit(3000); // 1st time
		        gold.increaseLimit(5000); // 2nd time
		        gold.increaseLimit(6000); // Invalid, exceeds 5000
		        gold.increaseLimit(4000); // 3rd valid time
		        gold.increaseLimit(2000); // Should fail (already 3 times)
		        gold.viewCreditAmount();
		    }
		}

	
	
	
	
