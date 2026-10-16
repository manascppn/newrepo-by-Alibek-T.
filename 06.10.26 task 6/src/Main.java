import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // WHILE LOOP
        System.out.println("While loop:");
        int i = 1;

        while (i <= n) {
            System.out.print(i + " ");
            i += 2;
        }

        // DO-WHILE LOOP
        System.out.println("\nDo-while loop:");
        i = 1;

        if (n >= 1) {
            do {
                System.out.print(i + " ");
                i += 2;
            } while (i <= n);
        }

        // FOR LOOP
        System.out.println("\nFor loop:");

        for (i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}