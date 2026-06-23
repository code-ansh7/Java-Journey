import java.util.*;
import java.io.*;
public class FileExistChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        String fileName = sc.nextLine();
        File f1 = new File(fileName);

        System.out.println("File exists? " + f1.exists());
    }
}
