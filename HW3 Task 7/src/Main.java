import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Loan Approval System ===");

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your monthly income: ");
        double income = input.nextDouble();

        System.out.print("Enter your credit score (0-100): ");
        int creditScore = input.nextInt();

        System.out.print("Enter years at current job: ");
        int yearsAtJob = input.nextInt();

        System.out.print("Do you have existing debt? (true/false): ");
        boolean hasDebt = input.nextBoolean();

        boolean ageOK = age >= 21 && age <= 65;
        boolean incomeOK = income >= 30000;
        boolean creditOK = creditScore >= 70;
        boolean jobOrDebtOK = yearsAtJob >= 2 || !hasDebt;

        System.out.println("\n=== Application Evaluation ===");

        if (ageOK) {
            System.out.println("Age requirement: OK");
        } else {
            System.out.println("Age requirement: NOT MET");
        }

        if (incomeOK) {
            System.out.println("Income requirement: OK");
        } else {
            System.out.println("Income requirement: NOT MET");
        }

        if (creditOK) {
            System.out.println("Credit score requirement: OK");
        } else {
            System.out.println("Credit score requirement: NOT MET");
        }

        if (ageOK && incomeOK && creditOK && jobOrDebtOK) {
            System.out.println("Result: Loan Approved");
        } else {
            System.out.println("Result: Loan Rejected");
        }
    }
}
