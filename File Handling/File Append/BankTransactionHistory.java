
import java.util.*;
import java.io.*;

public class BankTransactionHistory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n1.Deposit.\n2.Withdraw.\n\n");
        try {
            FileWriter fw = new FileWriter("BankHistory.txt", true);

            System.out.print("Enter Your Choice: ");
            int ch = sc.nextInt();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();
            if (ch == 1) {
                fw.write("Deposit: " + amount);
                fw.write("\n");
            } else if (ch == 2) {
                fw.write("Withdraw: " + amount);
                fw.write("\n");
            } else {
                System.out.println("Invalid Choice");
            }
            System.out.println("Transaction Saved Successfully...");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
