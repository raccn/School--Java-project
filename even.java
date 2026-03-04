public class even {
    public static void main(String[] args) {

        int number = 0;

        System.out.println("Even numbers from 0 to 20:");
        while (number <= 20) {
            System.out.println(number);
            number = number + 2;
        }

        number = 1; // reset for odd numbers

        System.out.println("Odd numbers from 0 to 20:");
        while (number < 20) {
            System.out.println(number);
            number = number + 2;
        }
    }
}

