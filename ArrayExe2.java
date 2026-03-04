public class ArrayExe2 {
    public static void main(String[] args) {
        String[] studentNames = new String[3];
        int[] studentAges = new int[3];

        studentNames[0] = "Alice";
        studentAges[0] = 20;

        studentNames[1] = "Bob";
        studentAges[1] = 22;

        studentNames[2] = "Charlie";
        studentAges[2] = 19;

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + studentNames[i] + "; Age: " + studentAges[i]);
        }
    }
    
}
// create an array that can store 3 student names.
// create an array that can stor 3 student ages.
//Add data into arrays.
//Display array data -> Name; Age;
