
import java.util.Scanner;

public class ArrayExe4 {
    public static void main(String[] args) {
        System.out.println("Creating Array Using Array Initializer {}");
        String[] gender = {"Male", "Female", "Other"};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String myName = sc.nextLine();

        System.out.println("Enter Your Gender:");
        String myGender = sc.nextLine();

        if (myGender.equalsIgnoreCase(gender[0]) || myGender.equalsIgnoreCase(gender[1]) || myGender.equalsIgnoreCase(gender[2])) {
            System.out.println("Gender Type is Valid.");
            System.out.println("Hi, " + myName);
        } else {
            System.out.println("Gender Type is Invalid.");
        }

    }
}
