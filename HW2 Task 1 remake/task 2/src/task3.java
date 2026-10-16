import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Hi. To check whether ur number is odd or even, enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
