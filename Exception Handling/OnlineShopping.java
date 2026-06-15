import java.util.*;
class OutOfStockException extends Exception{
    OutOfStockException(String msg){
        super(msg);
    }
}
public class OnlineShopping{
    static void validity(int stock, int userWant) throws OutOfStockException{
        if(stock < userWant) throw new OutOfStockException("Requested quantity not available");
        System.out.println("Order placed Successfully...");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter Your Stock: ");
            int stock = sc.nextInt();
            System.out.print("Enter User wanted Quantity: ");
            int userWant = sc.nextInt();
            validity(stock, userWant);
        } catch(OutOfStockException e){
            System.out.println(e.getMessage());
        } catch(InputMismatchException e){
            System.out.println("Please enter numbers only!");
            sc.nextLine();
        }     
    }
}
