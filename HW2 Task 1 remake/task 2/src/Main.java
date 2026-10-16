import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote yet.");
        }
    }
}