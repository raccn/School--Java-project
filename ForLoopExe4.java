
import java.util.Scanner;

public class ForLoopExe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Looping count: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println(i + ". " + name);
        }

        scanner.close();
        System.out.println("Thank you! " + name);
    }
    
}


