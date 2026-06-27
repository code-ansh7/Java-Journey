import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterInOneFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("BufferedWriterRevision.txt", true));

            // Taking User Input
            System.out.print("Enter Your Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Your City : ");
            String city = sc.nextLine();

             // Writing Data into File
            bw.write("========== Student Record ==========");
            bw.newLine();

            bw.write("Name : " + name);
            bw.newLine();

            bw.write("Age  : " + age);
            bw.newLine();

            bw.write("City : " + city);
            bw.newLine();

            // Blank Line
            bw.newLine();

            bw.write("BufferedWriter Revision Completed Successfully!");
            bw.newLine();

            bw.write("------------------------------------------");
            bw.newLine();

             // Closing BufferedWriter , Always Close Resources
            bw.close();

            System.out.println();
            System.out.println("Data Written Successfully!");

        }

        catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

        sc.close();
    }
}
