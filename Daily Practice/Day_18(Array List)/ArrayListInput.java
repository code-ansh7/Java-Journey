 import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initially empty ArrayList
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Initial Size : " + students.size());

        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();

        // nextInt() ke baad nextLine() use karte hain
        // taaki Enter key buffer se remove ho jaye
        sc.nextLine();

        // User jitne students chahe add kar sakta hai
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter " + i + " Student Name: ");
            String name = sc.nextLine();

            // Student list me add
            students.add(name);

            // Har add ke baad size print kar rahe hain
            System.out.println("Current Size = " + students.size());
        }

        System.out.println("\n===== STUDENT LIST =====");
        System.out.println(students);

        // First student access karna
        if (students.size() > 0) {

            System.out.println("\nFirst Student : " + students.get(0));
        }

        // Last student remove karna
        if (students.size() > 0) {

            System.out.println("\nRemoving Last Student...");

            students.remove(students.size() - 1);

            System.out.println("Updated List : " + students);

            System.out.println("Updated Size : " + students.size());
        }

        sc.close();
    }
}