import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SkipFirstLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter file Name: ");
        String fileName = sc.nextLine();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            br.readLine();// resd but not print
            while((line = br.readLine()) != null){
                if(line.equals("")) 
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
