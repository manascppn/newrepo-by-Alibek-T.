import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = input.next();

        double result;

        switch (operation) {

            case "+":
                result = a + b;
                System.out.println("Operation: Addition");
                System.out.println("Result: " + result);
                break;

            case "-":
                result = a - b;
                System.out.println("Operation: Subtraction");
                System.out.println("Result: " + result);
                break;

            case "*":
                result = a * b;
                System.out.println("Operation: Multiplication");
                System.out.println("Result: " + result);
                break;

            case "/":
                if (b == 0) {
                    System.out.println("Warning: Cannot divide by zero.");
                } else {
                    result = a / b;
                    System.out.println("Operation: Division");
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Warning: Non-existent operation.");
        }
    }
}