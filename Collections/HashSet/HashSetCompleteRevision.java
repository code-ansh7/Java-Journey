import java.util.*;
public class HashSetCompleteRevision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // HashSet only stores unique elements
        HashSet<String> names = new HashSet<>();

        System.out.print("How many names do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Taking user input and adding names into HashSet
        // If duplicate name is entered, HashSet will ignore it automatically
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter Name " + i + ": ");
            names.add(sc.nextLine());
        }

        // Printing all unique names stored in HashSet
        System.out.println("\nUnique Names: " + names);

        // Printing total unique names present in HashSet
        System.out.println("Total Unique Names: " + names.size());

        // Searching a name using contains()
        System.out.print("\nEnter Name To Search: ");
        String searchName = sc.nextLine();

        if(names.contains(searchName)) {
            System.out.println(searchName + " Found!");
        } else {
            System.out.println(searchName + " Not Found!");
        }

        // Removing a name from HashSet
        System.out.print("\nEnter Name To Remove: ");
        String removeName = sc.nextLine();

        if(names.contains(removeName)) {
            names.remove(removeName);
            System.out.println(removeName + " Removed Successfully!");
        } else {
            System.out.println(removeName + " Not Present In HashSet!");
        }

        // Printing HashSet after remove operation
        System.out.println("\nHashSet After Remove: " + names);

        // Printing updated size after removal
        System.out.println("Updated Size: " + names.size());

        // Traversing HashSet using for-each loop
        System.out.println("\nTraversing HashSet:");

        for(String name : names) {
            System.out.println(name);
        }

        // Checking whether HashSet is empty or not
        System.out.println("\nIs HashSet Empty? " + names.isEmpty());

        // Removing all elements from HashSet
        names.clear();

        // Printing HashSet after clear()
        System.out.println("\nAfter clear(): " + names);

        // Checking again whether HashSet is empty
        System.out.println("Is HashSet Empty Now? " + names.isEmpty());

        sc.close();
    }
} 
