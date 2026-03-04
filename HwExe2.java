import java.util.Scanner;
public class HwExe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int count = 1;
        while(count <= 10){
            System.out.println(number + "*" + count + " = " + (number * count));
            count = count + 1;
        }
        
        scanner.close();
    }
    
}
