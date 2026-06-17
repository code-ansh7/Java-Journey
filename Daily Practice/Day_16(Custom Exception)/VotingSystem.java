import java.util.*;

class InvalidAgeException extends Exception{

    InvalidAgeException(String msg) {
        super(msg);
    }   
}

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Your age: ");
            int age = sc.nextInt();
            if(age < 18){
                throw new InvalidAgeException("Age must be '18' or above!");
            }
            System.out.println("You can Vote...");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
