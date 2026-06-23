import java.util.*;
import java.io.*;
public class FileHandlingRevision{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        System.out.println("File Name: " + file.getName());

        System.out.println("File Path: " + file.getAbsolutePath());

        if(file.exists()) System.out.println("File Already Exist...");
        else {
            file.createNewFile();
            System.out.println("File created sucessfully...");
        }
    }
}
