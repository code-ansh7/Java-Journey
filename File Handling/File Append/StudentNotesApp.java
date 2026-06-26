
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class StudentNotesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Note\n2.Shoe Notes.\n3.Clear History.\n4.Exit.");
        System.out.println();
        try {
            FileWriter fInfo = new FileWriter("Notes.txt");
            File f = new File("Notes.txt");
            fInfo.write(f.getName());
            fInfo.write("\n");
            fInfo.write(f.getAbsolutePath());
            fInfo.write("\n");
            fInfo.write("\n");
            fInfo.close();
            while (true) {
                System.out.print("Enter Your Choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    FileWriter fw = new FileWriter("Notes.txt", true);
                    System.out.print("Enter Your Note: ");
                    String note = sc.nextLine();
                    fw.write(note);
                    fw.write("\n");
                    fw.close();
                } else if (choice == 2) {
                    FileReader fr = new FileReader("Notes.txt");
                    int filePointer;
                    System.out.println();
                    while ((filePointer = fr.read()) != -1) {
                        System.out.print((char) filePointer);
                    }
                    System.out.println();
                    fr.close();
                } else if(choice == 3){
                    FileWriter fw = new FileWriter("Notes.txt");
                    fw.write("");
                    fw.close();
                }
                else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Invalid Choice...");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
