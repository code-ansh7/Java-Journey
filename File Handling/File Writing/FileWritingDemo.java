import java.util.*;
import java.io.*;

public class FileWritingDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file Name: ");
        String fileName = sc.nextLine();

        FileWriter fw = new FileWriter(fileName);

        fw.write("Hello\nI am Ansh Rastogi");

        System.out.println("Data written sucessfully...");

        fw.close();
    }
}
