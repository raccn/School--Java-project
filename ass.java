import java.io.*;
import java.util.Scanner;


public class ass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to User Management System");
        System.out.println("Please choose an option:");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Logout");
        System.out.println("4. Exit");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                registerUser();
                break;
            case 2:
                loginUser();
                break;
            case 3:
                logoutUser();
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
        }
        
        scanner.close();
    }

    private static void registerUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.next();
        
        System.out.print("Enter password: ");
        String password = scanner.next();
        
        System.out.print("Enter email: ");
        String email = scanner.next();
        
        System.out.print("Enter phone number: ");
        String phone = scanner.next();
        
        try (FileWriter fw = new FileWriter("users.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            out.println(username + "," + password + "," + email + "," + phone);
            System.out.println("User registered successfully.");
        } catch (IOException e) {
            System.out.println("Error opening file.");
        }
        
        scanner.close();
    }

    private static void loginUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.next();
        
        System.out.print("Enter password: ");
        String password = scanner.next();
        
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    System.out.println("Login successful.");
                    scanner.close();
                    return;
                }
            }
            System.out.println("Invalid username or password. Please try again.");
        } catch (IOException e) {
            System.out.println("Error opening file.");
        }
        
        scanner.close();
    }

    private static void logoutUser() {
        System.out.println("You are now logged out.");
    }
}

