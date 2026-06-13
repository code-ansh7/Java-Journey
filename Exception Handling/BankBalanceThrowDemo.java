import java.util.*;
public class BankBalanceThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int balance = 1000;
        // int withdraw = 2000;
        System.out.print("Enter your money: ");
        int balance = sc.nextInt();
        System.out.print("Enter money you want to withdraw: ");
        int withdraw = sc.nextInt();
        try{
            if(withdraw > balance){
                throw new ArithmeticException("Insufficient Balance!");
            }
            System.out.println(withdraw + " is debited.");
            System.out.println("Transaction successfully...");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thank you!");
    }
}
