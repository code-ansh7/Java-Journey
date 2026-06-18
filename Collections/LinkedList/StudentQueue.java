import java.util.*;

public class StudentQueue {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        // Students added normally
        students.add("Rahul");
        students.add("Aman");
        students.add("Vansh");

        // Late admission student
        students.addFirst("Ansh");

        // New student at end
        students.addLast("Rohit");

        System.out.println("Student Queue: " + students);

        // First student
        System.out.println("First Student: " + students.getFirst());

        // Last student
        System.out.println("Last Student: " + students.getLast());

        // Remove second student
        students.remove(1);

        System.out.println("Updated Queue: " + students);

        // Traversal using for-each
        System.out.println("\nAll Students:");

        for(String name : students) {
            System.out.println(name);
        }
    }
}
