import java.io.FileReader;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter File name: ");
            String fileName = sc.nextLine();

            FileReader fr = new FileReader(fileName);
            int ch;
            int count = 0;
            while((ch = fr.read()) != -1){
                count++;
                System.out.print((char) ch);
            }
            System.out.println("\nFile Contains " + count + " Characters.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
