import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class FileWritingRevision {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName =  sc.nextLine();

        File f = new File(fileName);
        f.createNewFile();
        FileWriter fw = new FileWriter(fileName);

        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());

        fw.write("File Name: " + f.getName() + "\n");
        fw.write("File Path: " + f.getAbsolutePath());

        System.out.print("Enter Data You want to write in file: ");
        String data = sc.nextLine();

        fw.write("\n\n");
        fw.write(data);

        System.out.println("Data written sucessfully...");
        fw.close();
    }
}
