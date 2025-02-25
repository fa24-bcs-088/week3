import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enteredUsername;
        String enteredPassword;

        System.out.print("Enter username: ");
        enteredUsername = sc.nextLine();

        System.out.print("Enter password: ");
        enteredPassword = sc.nextLine();

        
        if (enteredUsername.equals(User.username) && enteredPassword.equals(User.password)) {
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("Error: Incorrect username or password!");
        }

       
    }
}
