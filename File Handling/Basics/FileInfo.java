import java.io.File;
public class FileInfo{
    public static void main(String args[]){
        File file = new File("Java.txt");

        System.out.println("File Name: " + file.getName());

        System.out.println("File Path: " + file.getAbsolutePath());

        System.out.println("File Exist ? " + file.exists());
    }
}
