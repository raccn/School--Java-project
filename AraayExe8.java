public class AraayExe8 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        String[] studentName = new String[size];
        String[] studentBatch = new String[size];
        int[] studentID = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Student Name: ");
            studentName[i] = sc.next();
            System.out.print("Enter Student Batch: ");
            studentBatch[i] = sc.next();
            System.out.print("Enter Student ID: ");
            studentID[i] = sc.nextInt();

            System.out.println("-----------------------------");
        }
        System.out.println("Display Student Information:\n");
        System.out.println("Student Name\tStudent Batch\tStudent ID");
        for (int i = 0; i < size; i++) {
            System.out.println(studentName[i] + "\t\t" + studentBatch[i] + "\t\t" + studentID[i]);
        }
    }
}


