public class ForLoopExe3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number >= 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("No of Positive Count: " + positiveCount);
        System.out.println("No of Negative Count: " + negativeCount);
        
        scanner.close();
    }
    
}

/*
    Ask a number from user 5 times using for loop.
    Display how many  positive and negative numbers entered by user.
*/
