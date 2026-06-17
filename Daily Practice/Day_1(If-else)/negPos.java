import java.util.Scanner;
public class negPos {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.err.print("Enter your Number : ");
         int num = sc.nextInt();

         if (num > 0) {
             System.err.println(num+" is a Positive number.");
         }
         else if(num < 0){
             System.err.println(num+" is a Negtive number.");
         }
         else{
             System.err.println("Number is Zero.");

         }
     }
}
