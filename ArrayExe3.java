public class ArrayExe3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String[] userNames = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your name :");
            userNames[i] = scanner.nextLine();
        }
        System.out.println("----------- display Array Values ------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("At index " + i + ", your input name is: " + userNames[i]);
        }

        scanner.close();
    }
    
}
/*
    Create an array that can store 3 user input names.
    Display array values:
    At index 0, your input name is: ___
    At index 1, your input name is: ___
    At index 2, your input name is: ___
*/
