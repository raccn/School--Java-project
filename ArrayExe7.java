public class ArrayExe7 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nReversed array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
