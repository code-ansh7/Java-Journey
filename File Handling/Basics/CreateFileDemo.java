import java.util.*;
import java.io.*;
public class CreateFileDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        boolean result = file.createNewFile();

        if(result)
            System.out.println("File created Sucessfully...");
        else
            System.out.println("File Already Exists!");
    }
}
