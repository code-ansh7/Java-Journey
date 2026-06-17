import java.util.*;

class InvalidMarksException extends Exception {

    public InvalidMarksException(String msg) {
        super(msg);
    }
    
}
public class StudentMarksValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your Marks: ");
            int marks = sc.nextInt();
            if(marks < 0 || marks > 100){
                throw new InvalidMarksException("Marks should be between 0 and 100!");
            }
            System.out.println("Marks accepted!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}