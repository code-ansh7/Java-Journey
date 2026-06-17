import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Your Age: ");
            int age = sc.nextInt();

            System.out.println("Age = " + age);

        }
        catch (InputMismatchException e) {

            System.out.println(
                    "Please Enter Numbers Only!");

            /*
             * User ne galat input diya.
             *
             * Example:
             * Ansh
             *
             * Ye input buffer mein pada hua hai.
             *
             * Agar ise clear nahi kiya,
             * to next iteration mein fir se
             * wahi input read hoga.
             */

            sc.nextLine(); // Wrong Input Remove
        }

        sc.close();
    }
}