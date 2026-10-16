
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total purchase amount: $");
        double amount = sc.nextDouble();

        System.out.print("Are you a premium member? (true/false): ");
        boolean premium = sc.nextBoolean();

        System.out.print("Enter number of previous orders: ");
        int orders = sc.nextInt();

        System.out.print("Do you have a discount coupon? (true/false): ");
        boolean coupon = sc.nextBoolean();

        System.out.print("Is this your birthday month? (true/false): ");
        boolean birthday = sc.nextBoolean();

        int discount = 0;

        if (amount >= 200 && premium && (coupon || birthday)) {
            discount = 20;
        } else if (amount >= 150 && (premium || orders >= 10)) {
            discount = 15;
        } else if (amount >= 100 && coupon) {
            discount = 10;
        } else {
            discount = 0;
        }

        double discountAmount = amount * discount / 100.0;
        double finalPrice = amount - discountAmount;

        System.out.println("\n===== DISCOUNT SUMMARY =====");
        System.out.printf("Original price: $%.2f%n", amount);
        System.out.println("Discount: " + discount + "%");
        System.out.printf("Discount amount: $%.2f%n", discountAmount);
        System.out.printf("Final price: $%.2f%n", finalPrice);

        sc.close();
    }
}