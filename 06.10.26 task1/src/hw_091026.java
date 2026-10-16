
import java.util.Scanner;

public class hw_091026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 3;
        boolean loggedIn = false;

        double balance = 1000.0;

        System.out.println("===== SIMPLE ATM =====");

        // Step 1: PIN verification
        while (attempts > 0 && !loggedIn) {
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                attempts--;
                System.out.println("Incorrect PIN.");

                if (attempts > 0) {
                    System.out.println("Attempts left: " + attempts);
                }
            }
        }

        if (!loggedIn) {
            System.out.println("Your account has been blocked.");
            sc.close();
            return;
        }

        // Step 2: ATM menu
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Current balance: " + balance);

            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();

                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposit successful.");
                    System.out.println("Updated balance: " + balance);
                } else {
                    System.out.println("Invalid amount. Deposit must be greater than zero.");
                }

            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                } else if (amount > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= amount;
                    System.out.println("Withdrawal successful.");
                    System.out.println("Updated balance: " + balance);
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");

            } else {
                System.out.println("Invalid option. Please choose 1-4.");
            }
        }

        sc.close();
    }
}