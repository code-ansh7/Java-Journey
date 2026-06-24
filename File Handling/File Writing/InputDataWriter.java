import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class InputDataWriter {
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        FileWriter fw = new FileWriter(fileName);

        System.out.print("Enter Data You want to write: ");
        String data = sc.nextLine();

        fw.write(data);

        System.out.println("Data written sucessfully...");
        fw.close();
   } 
}
