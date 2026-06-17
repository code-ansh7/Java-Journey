import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class throwsBasicDemo {

    public static void main(String[] args)  throws FileNotFoundException {

        File file = new File("abc.txt");

        Scanner sc = new Scanner(file);

        System.out.println("File Opened");
    }
}