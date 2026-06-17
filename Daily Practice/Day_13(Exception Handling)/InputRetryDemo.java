 import java.util.*;

public class InputRetryDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            try {

                System.out.print("Enter Your Age : ");

                int age = sc.nextInt();

                System.out.println("Age = " + age);

                // Exit loop if input is correct
                break; // break the while loop!
            }
            catch(Exception e) {

                System.out.println("Invalid Input! Please Enter Numbers Only.");

                // Clears wrong input from scanner buffer
                sc.nextLine();//nhi to infinite loop chalega.
            }
        }

        System.out.println("Program End...");
    }
}