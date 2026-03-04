
import java.util.Scanner;

public class ForLoopExe2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        for(int count = 1; count <= 3; count++){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            sum = sum + number;
        } //end of for loop
        
        System.out.println("Sum Result of numbers: " + sum);
        sc.close();

    }

}
// Ask 3 numbers from user and display the sum result of that numbers.