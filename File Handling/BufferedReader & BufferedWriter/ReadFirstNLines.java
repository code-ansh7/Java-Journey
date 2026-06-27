import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstNLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter file Name: ");
        String fileName = sc.nextLine();
        try{
            System.out.print("Enter Lines: ");
            int n = sc.nextInt();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNumber = 0;
            while((line = br.readLine()) != null){
                lineNumber++;
                if(lineNumber <= n){
                    System.out.println((lineNumber) + ". " + line);
                }
            }
            br.close();
        } catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
    
}
