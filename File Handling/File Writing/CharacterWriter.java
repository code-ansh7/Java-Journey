import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterWriter {
    public static void main(String[] args) throws  IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file Name: ");
        String fileName = sc.nextLine();

        FileWriter fw = new FileWriter(fileName);

        fw.write('A');
        fw.write('B');
        fw.write("\n");
        fw.write('C');
        fw.write('D');

        System.out.println("Data writeen sucessfully...");

        fw.close();
    }
}
