import java.util.Scanner;

public class NextLineConceptDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User se age le rahe hain
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        sc.nextLine(); // Buffer Clear

        // Ab full line input safely read hogi
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("\n----- OUTPUT -----");
        System.out.println("Age  : " + age);
        System.out.println("Name : " + name);

        sc.close();
    }
}
