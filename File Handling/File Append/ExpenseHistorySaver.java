
import java.util.Scanner;
import java.io.FileWriter;

public class ExpenseHistorySaver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Your Expense: ");
            int expense = sc.nextInt();
            FileWriter fw = new FileWriter("Expenses.txt", true);
            fw.write("Expense: " + expense);
            fw.write("\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
