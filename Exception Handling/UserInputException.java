import java.util.*;
public class UserInputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            System.out.println("Your number: " + num);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Error!");
        }
        System.out.println("End...");
    }
}
