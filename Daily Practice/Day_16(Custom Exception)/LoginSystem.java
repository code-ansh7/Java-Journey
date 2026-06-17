import java.util.*;

class InvalidPasswordException extends Exception{

    public InvalidPasswordException(String msg) {
        super(msg);
    }
    
}
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your Password: ");
            String password = sc.nextLine();
            if(password.length() < 8) throw new InvalidPasswordException("Password must contain at least 8 characters");
            System.out.println("Log-in Successfully...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  
}
