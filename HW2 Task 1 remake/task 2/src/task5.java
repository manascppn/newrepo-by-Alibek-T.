import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Student Grading System ===");

        System.out.print("Enter attendance points (0-10): ");
        int attendance = input.nextInt();

        System.out.print("Enter homework points (0-60): ");
        int homework = input.nextInt();

        System.out.print("Enter exam points (0-30): ");
        int exam = input.nextInt();

        int total = attendance + homework + exam;

        System.out.println("\nTotal points: " + total + "/100");

        if (total > 65 && attendance >= 6 && exam >= 17) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
    }
}