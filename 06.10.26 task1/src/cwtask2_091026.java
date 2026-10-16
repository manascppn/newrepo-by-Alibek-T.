
import java.util.Scanner;

public class cwtask2_091026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < 5 && !guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            attempts++;

            if (guess == secretNumber) {
                guessedCorrectly = true;
                System.out.println("Correct!");
                System.out.println("You needed " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Game over!");
            System.out.println("The secret number was " + secretNumber + ".");
        }

        sc.close();
    }
}