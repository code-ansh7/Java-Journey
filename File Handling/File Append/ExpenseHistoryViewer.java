import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class ExpenseHistoryViewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Expense.\n2.Show History.\n3.Exit.");
        try {
            while (true) { 
                System.out.print("Enter Your Choice: ");
                int ch = sc.nextInt();
                
                if(ch == 1){
                    System.out.print("Enter YOur Expense: ");
                    int expense = sc.nextInt();
                    FileWriter fw = new FileWriter("ExpenseHistory.txt" , true);

                    fw.write("Expense : " + expense);
                    fw.write("\n");
                    fw.close();
                }
                else if(ch == 2){
                    FileReader fr = new FileReader("ExpenseHistory.txt");
                    System.out.println("====Your Expense History====");
                    System.out.println();
                    int c;
                    while((c = fr.read()) != -1){
                        System.out.print((char) c);
                    }
                    fr.close();
                 }
                 else break;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
