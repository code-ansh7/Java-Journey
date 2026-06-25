import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class LineCounter {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            FileReader fr = new FileReader(fileName);
            int ch;
            int count = 0;
            int line = 1;
            while((ch = fr.read()) != -1){
                System.out.print((char)ch);
                if((char) ch == '\n'){
                    line++;
                }
                if(ch != 32 && ch != 13 && ch != 10){
                    count++;
                }
                //also working....
                // if(ch != ' ' && ch != '\r' && ch != '\n'){
                //     count++;
                // }
             }
            System.out.println("\nFile contains " + count + " Characters with " + line + " Lines.");
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
