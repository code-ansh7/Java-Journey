import java.util.Scanner;
import java.io.FileWriter;
 
public class AppendDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File name: ");
        String fileName = sc.nextLine();
        try {
            FileWriter fw = new FileWriter(fileName , true);
            System.out.print("Enter Data: ");
            String data = sc.nextLine();
            fw.write(data);
            fw.write("\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
