import java.util.Scanner;
import java.io.FileReader;

public class ReadOneChar {
    public static void main(String args[]){
        try{
            FileReader fr = new FileReader("java.txt");
            int ch = fr.read();
            System.out.println("ASCII value: " + ch);
            System.out.println("Character: " + (char) ch);
            fr.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
