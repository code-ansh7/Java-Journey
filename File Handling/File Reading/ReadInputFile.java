import java.util.*;
import java.io.FileReader;

public class ReadInputFile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter File name: ");
            String fileName = sc.nextLine();

            FileReader fr = new FileReader(fileName);
            int ch;
            while((ch = fr.read()) != -1){
                System.out.print((char) ch);
            }
            fr.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
