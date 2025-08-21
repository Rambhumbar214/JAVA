package assignment1;
import java.util.Scanner;

class Account {
    int accno;
    String accname;
    double balance;

    Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    void display() {
        System.out.println("Acc No: " + accno + ", Name: " + accname + ", Balance: " + balance);
    }

    static void sortAccount(Account[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].balance > arr[j + 1].balance) {
                    Account temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class A1SBQ3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            int accno = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Account Name: ");
            String accname = sc.nextLine();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // consume newline

            accounts[i] = new Account(accno, accname, balance);
        }

        Account.sortAccount(accounts);

        System.out.println("\nAccounts sorted by balance:");
        for (Account acc : accounts) {
            acc.display();
        }
    }
}
