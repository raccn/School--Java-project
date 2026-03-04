public class ArrayExe {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // index no 0 to 4
        numbers[0] = 10; //Adding data into array
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        for (int i = 0; i < 5; i++) {
            System.out.println( "At Index No: "+ i +" is "+ numbers[i]);
        }
    
    }
}