import java.util.*;
public class ArrayListRevision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ArrayList ek Dynamic Array hai.
        // Hume size pehle define nahi karni padti.
        ArrayList<String> students = new ArrayList<>();

        System.out.print("How many Students? ");
        int n = sc.nextInt();

        // nextInt() sirf number read karta hai.
        // Enter key (\n) buffer me reh jati hai.
        // Isliye nextLine() se buffer clear karte hain.
        sc.nextLine();

        // User jitne students chahe add kar sakta hai.
        // ArrayList size automatically increase karti hai.
        for(int i = 1; i <= n; i++) {

            System.out.print("Enter Student " + i + " Name: ");

            String name = sc.nextLine();

            // add() method ArrayList me element add karti hai.
            students.add(name);

            // size() total elements count return karta hai.
            System.out.println("Current Student's: " + students.size());
        }

        // Puri ArrayList print karna.
        System.out.println("Students: " + students);

        // get(index) specific element access karta hai.
        // Index 0 hamesha first element hota hai.
        System.out.println("First Student: " + students.get(0));

        // size() total elements deta hai.
        // Last index hamesha size()-1 hota hai.
        System.out.println("Last Student: "
                + students.get(students.size() - 1));

        // Last student remove kar rahe hain.
        // remove(index) given index ka element delete karta hai.
        students.remove(students.size() - 1);

        // Updated list print.
        System.out.println("Updated Student's List: " + students);

        // Updated count print.
        System.out.println("Total Student's: " + students.size());

        sc.close();
    }
}
