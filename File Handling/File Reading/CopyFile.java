import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter File Name: ");
            String fileName = sc.nextLine();

            FileReader fr = new FileReader(fileName);
            FileWriter fw = new FileWriter("copy.txt");

            int ch;
            int count = 0;
            while((ch = fr.read()) != -1){
                fw.write((char) ch);
                if(ch != ' ' && ch != '\r' && ch != '\n')
                    count++;
            }
            fw.write("\nFile contains " + count + " Characters.");
            System.out.println("\nFile contains " + count + " Characters.");
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
