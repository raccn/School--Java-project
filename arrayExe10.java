public class arrayExe10 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        //Store Data with indexno 0 to 4
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Your Search Name? ");
        String searchName = sc.next();
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Your search name " + searchName + " is found in index no " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Your search name " + searchName + " is not found in the array");
            
        }
    }
}
/*
 Enter Your Search Name?
Alic
(If found) Your search name Alic is found in index no-3
(If not found) Your search name Alic is not found in the array
*/