import java.util.Scanner;

public class HwExe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int count = 1;
            while (count <= 10) {
                System.out.println(number + " * " + count + " = " + (number * count));
                count++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
        System.out.println("Program ended.");
    }
}