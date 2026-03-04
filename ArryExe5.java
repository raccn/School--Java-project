
import java.util.Scanner;

public class ArryExe5 {
    public static void main(String[] args) {
        String[] namelist = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Search Name?");
        String searchName = sc.nextLine();

        boolean found = false;
        for(int count=0; count < 5 ; count++) {
        if(searchName.equalsIgnoreCase(namelist[count])) {
            found = true;
            System.out.println("Your Search Name - "+searchName+" Found in the List." );
        }
    }

    if(!found) {
        System.out.println("Your Search Name - "+searchName+" Not Found in the List." );
    }

    }
}
