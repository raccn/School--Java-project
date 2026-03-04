public class EvenOdd {
    public static void main(String[] args) {

        int number = 0;

        System.out.println("Even numbers from 0 to 20:");
        while (number <= 20) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }

        number = 0;

        System.out.println("Odd numbers from 0 to 20:");
        while (number <= 20) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}

