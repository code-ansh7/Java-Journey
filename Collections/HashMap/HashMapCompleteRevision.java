import java.util.*;

public class HashMapCompleteRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HashMap stores data in Key -> Value format
        // Here Key = Student Name
        // Value = Marks
        HashMap<String, Integer> marks = new HashMap<>();

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Taking student details from user
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            int mark = sc.nextInt();
            sc.nextLine(); // Clears buffer after nextInt() means next Iteration
            // Storing name and marks in HashMap
            marks.put(name, mark);
        }

        // Printing complete HashMap
        System.out.println("\nStudent Records: " + marks);

        // Printing total key-value pairs
        System.out.println("Total Students: " + marks.size());

        // Searching student using key
        System.out.print("\nEnter Student Name To Search: ");
        String searchName = sc.nextLine();

        // containsKey() checks whether key exists or not
        if(marks.containsKey(searchName)) {
            // get() returns value using key
            System.out.println(searchName + "'s Marks: " + marks.get(searchName));
        }
        else {
            System.out.println("Student Not Found!");
        }

        // Checking whether a particular marks value exists
        System.out.print("\nEnter Marks To Check: ");
        int searchMarks = sc.nextInt();

        // containsValue() checks whether value exists or not
        if(marks.containsValue(searchMarks)) {
            System.out.println(searchMarks + " Exists In HashMap");
        }
        else {
            System.out.println(searchMarks + " Not Found");
        }

        sc.nextLine();

        // Removing a student record
        System.out.print("\nEnter Student Name To Remove: ");
        String removeName = sc.nextLine();

        if(marks.containsKey(removeName)) {
            // remove() deletes key-value pair
            marks.remove(removeName);
            System.out.println(removeName + " Removed Successfully!");
        }
        else {
            System.out.println("Student Not Found!");
        }

        // Printing updated HashMap
        System.out.println("\nHashMap After Removal: " + marks);

        // Traversing HashMap
        System.out.println("\nTraversing HashMap:");

        // keySet() returns all keys present in HashMap
        for(String key : marks.keySet()) {
            System.out.println(key + " : " + marks.get(key));
        }

        // Checking whether HashMap is empty
        System.out.println("\nIs HashMap Empty? " + marks.isEmpty());

        // Removing all key-value pairs
        marks.clear();

        // Printing HashMap after clear()
        System.out.println("\nAfter clear(): " + marks);

        // Checking again whether HashMap is empty
        System.out.println("Is HashMap Empty Now? " + marks.isEmpty());

        sc.close();
    }
}
