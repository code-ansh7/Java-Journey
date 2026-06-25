import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class UpperCaseLowerCaseConverter {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            FileReader fr1 = new FileReader(fileName);
            FileWriter fw = new FileWriter("output.txt");

            int ch;
            while((ch = fr1.read()) != -1){
                char c = (char) ch;               
                fw.write(Character.toUpperCase(c));
            }
            fr1.close();
            // new file reader created because fr1 = -1 
            // Creating a new FileReader because the previous reader
            // has already reached the end of the file (EOF).
            FileReader fr2 = new FileReader(fileName);

            fw.write("\n");
            fw.write("\n");
            while((ch = fr2.read()) != -1){
                char c = (char) ch;
                fw.write(Character.toLowerCase(c));
            }
            fw.close();
            fr2.close();

        } catch (Exception e) {
            System.out.println("File Not Found!");
        }
    }
}
