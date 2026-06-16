import java.util.Scanner;
import java.util.ArrayList;

public class StudentListManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Students? ");
        int n = sc.nextInt();

        sc.nextLine(); // for empty buffer 

        ArrayList<String> students = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.print("Enter " + i + " Student name: ");
            String name = sc.nextLine();
            students.add(name);
            System.out.println("Current Student's: " + students.size());
        }
        System.out.println("Students: " + students);
        System.out.println("First Student: " + students.get(0));
        students.remove(students.size()-1);
        System.out.println("Last student after update: " + students.get(students.size()-1));
        System.out.println("Updated Student's List: " + students);
        System.out.println("Updated size: " + students.size());
    }
}
