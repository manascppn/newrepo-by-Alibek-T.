import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = scanner.nextInt();

        // WHILE LOOP
        System.out.println("While loop:");
        int i = 2;

        while (i <= n) {
            System.out.print(i + " ");
            i += 2;
        }

        // DO-WHILE LOOP
        System.out.println("\nDo-while loop:");
        i = 2;

        if (n >= 2) {
            do {
                System.out.print(i + " ");
                i += 2;
            } while (i <= n);
        }

        // FOR LOOP
        System.out.println("\nFor loop:");

        for (i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}