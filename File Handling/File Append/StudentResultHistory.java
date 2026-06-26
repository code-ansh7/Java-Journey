import java.util.Scanner;
import java.io.*;

public class StudentResultHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

           System.out.print("Enter Student Name: ");
           String name = sc.nextLine();

           System.out.print("Enter Marks: ");
           int marks = sc.nextInt();

           FileWriter fw = new FileWriter("Marks.txt",true);

           fw.write(name + " : " + marks);
           fw.write("\n");

           System.out.println("Marks Saved Sucessfully...");

           fw.close();

        } 
        catch (Exception e) {

            System.out.println(e);

        }
    }
}
