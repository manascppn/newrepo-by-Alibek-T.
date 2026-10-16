import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 3;
        boolean accessGranted = false;
        while (attempts > 0 && !accessGranted) {
            System.out.println("Hii pls enter ur pin: ");
            int pin = sc.nextInt();
            if (pin == correctPin) {
                accessGranted = true;
                System.out.println("Access granted!");
            } else {
                attempts--;
                System.out.println("Incorrect pin!!! :(");
                System.out.println("Attempts left: " + attempts);
            }
        }

            if (!accessGranted) {
                System.out.println("Card blocked.");
            }

            sc.close();
        }
    }