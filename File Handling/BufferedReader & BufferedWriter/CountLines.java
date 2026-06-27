import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        String fileName = sc.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int count = 0;
            int nonEmptyLines = 0;
            while((line = br.readLine()) != null){
                if (!(line.trim().isEmpty())) nonEmptyLines++;
                System.out.println(line);
                count++;
            }
            System.out.println();
            System.out.printf("File has %d Lines including Blank Line.\n",count);
            System.out.printf("File has %d Non Empty Lines.",nonEmptyLines);
            System.out.println();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        sc.close();
    }
}
