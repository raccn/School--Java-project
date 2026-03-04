import java.util.Scanner;

public class HwExe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int count = 1;
            int evenCount = 0;
            int oddCount = 0;

            while (count <= 10) {
                int result = number * count;
                System.out.println(number + " * " + count + " = " + result);

                if (result % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                count++;
            }

            System.out.println("Even numbers count: " + evenCount);
            System.out.println("Odd numbers count: " + oddCount);

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
        System.out.println("Program ended.");
    }
}

