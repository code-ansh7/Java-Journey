import java.util.*;
public class FinallyBlockDemo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);       
        try{
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();  
            System.out.println("Sum: " + a/b);
        }
        catch(Exception e){// e is object of exception class 
            System.out.println(e);
            System.out.println("Error...");
        }
        finally{
            sc.close();
            System.out.println("Scanner closed successfully...");// always executes 
        }
        System.out.println("Program end...");
    }
}
