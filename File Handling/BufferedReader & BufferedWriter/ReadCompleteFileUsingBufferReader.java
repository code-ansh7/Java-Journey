import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCompleteFileUsingBufferReader {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter file Name: ");
        String fileName = sc.nextLine();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine()) != null){
                // line.trim().isEmpty()
                if(line.equals("")) //or line.isEmpty()
                    continue;
                System.out.println(line);
            }
            br.close();
        } catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
