import java.util.*;
// Custom Exception Class:
//   Hum apni khud ki exception bana rahe hain.
//   Ye Exception class ki child class hai.
class InvalidAgeException extends Exception {
    //   Constructor
    //   Jab object create hoga:
    //   new InvalidAgeException("Age must be 18+")
    //   tab ye constructor chalega.
    InvalidAgeException(String msg) {
        //   super(msg)  
        //   Exception class ke constructor ko call karta hai.
        //   Isi wajah se:
        //   e.getMessage()
        //   custom message return karta hai.
        super(msg);
    }
}

public class ExceptionHandlingMasterDemo{
    //  throws keyword
    //  Java ko warning:
    //  "Ye method InvalidAgeException throw kar sakta hai"
    static void validateAge(int age)
            throws InvalidAgeException {

        //Custom Validation

        if (age < 18) {

            //   throw keyword
            //   Yahan exception object create ho raha hai.
            //   Object kaun create kar raha hai?
            //   ANSWER:
            //   Programmer

            throw new InvalidAgeException(
                    "Age must be 18 or above!");
        }

        System.out.println(
                "You are eligible to vote.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Your Age: ");

            //   Agar user
            //   20
            //   enter kare
            //   sab sahi chalega.
            //   Agar user:
            //   Ansh
            //   enter kare
            //   InputMismatchException aayegi.
            int age = sc.nextInt();

             // validateAge method call
            validateAge(age);

        }
        //  * InputMismatchException
        //   Jab user number ki jagah
        //   text enter kare.
        catch (InputMismatchException e) {

            System.out.println(
                    "Please enter numbers only!");
            //   Wrong input buffer se remove.
            //   Example:
            //   User entered:
            //   Ansh
            //   Agar nextLine() nahi lagaya
            //   to same input fir read hoga.
            sc.nextLine();
        }

         // Custom Exception Handle
        
        catch (InvalidAgeException e) {

            //e
            //Complete exception
        
            System.out.println(
                    "Using e:");
            System.out.println(e);

            System.out.println();

            
             //e.getMessage()
             //Sirf custom message
            
            System.out.println(
                    "Using e.getMessage():");
            System.out.println(
                    e.getMessage());
        }

         //finally
         //Exception aaye ya na aaye
         //ye block chalega.
        finally {

            System.out.println();
            System.out.println(
                    "Validation Process Finished.");

            sc.close();
        }

        System.out.println(
                "Program End.");
    }
}