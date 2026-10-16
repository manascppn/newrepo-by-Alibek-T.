import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = scanner.nextInt();

        // WHILE LOOP
        System.out.println("While loop:");
        int i = 1;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        // DO-WHILE LOOP
        System.out.println("\nDo-while loop:");
        i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);

        // FOR LOOP
        System.out.println("\nFor loop:");

        for (i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}