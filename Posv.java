import java.util.Scanner;

public class Posv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number >= 0) {
                System.out.println(number + " is a positive number.");
            } else {
                System.out.println(number + " is a negative number.");
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
        System.out.println("Program ended.");
    }
}
