
import java.util.*;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class BankManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your balance: ");
            int balance = sc.nextInt();
            System.out.print("Enter amount you want to withdraw: ");
            int amount = sc.nextInt();
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient Balance!");
            }
            System.out.println("Transaction Successfully...");
            System.out.println("Remaining Balance: " + (balance - amount));

        } catch (Exception e) {
            System.out.println(e + "\n" + e.getMessage());
        }
    }
}
