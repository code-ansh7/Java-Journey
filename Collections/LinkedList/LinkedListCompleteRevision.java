// LinkedList stores data using nodes.
// addFirst() -> Add element at beginning
// addLast() -> Add element at end
// getFirst() -> Access first element
// getLast() -> Access last element
// removeFirst() -> Remove first element
// removeLast() -> Remove last element
// contains() -> Search element
// size() -> Total elements
// LinkedList supports indexing but is slower than ArrayList for random access.
// LinkedList is better when insertion and deletion are frequent.
import java.util.*;
public class LinkedListCompleteRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // LinkedList stores data using nodes
        LinkedList<String> languages = new LinkedList<>();

        System.out.print("How many Languages? ");
        int n = sc.nextInt();
        sc.nextLine();

        // User se languages input lena
        for(int i = 1; i <= n; i++) {

            System.out.print("Enter Language " + i + ": ");
            languages.add(sc.nextLine());
        }

        System.out.println("\nOriginal List: " + languages);

        // Beginning me element add karna
        System.out.print("Enter First Language: ");
        languages.addFirst(sc.nextLine());

        // End me element add karna
        System.out.print("Enter Last Language: ");
        languages.addLast(sc.nextLine());

        System.out.println("\nAfter addFirst() and addLast()");
        System.out.println(languages);

        // First element access karna
        System.out.println("\nFirst Language: " + languages.getFirst());

        // Last element access karna
        System.out.println("Last Language: " + languages.getLast());

        // Index based access
        if(languages.size() > 2) {
            System.out.println("Language at Index 2: " + languages.get(2));
        }

        // Searching in LinkedList
        System.out.print("\nEnter Language To Search: ");
        String target = sc.nextLine();
        if(languages.contains(target)) {
            System.out.println(target + " Found!");
        }
        else {
            System.out.println(target + " Not Found!");
        }

        // Remove first element
        languages.removeFirst();
        // Remove last element
        languages.removeLast();
        System.out.println("\nAfter removeFirst() and removeLast()");
        System.out.println(languages);

        // Traversal using for-each loop
        System.out.println("\nTraversing LinkedList:");
        for(String lang : languages) {
            System.out.println(lang);
        }

        // Total elements
        System.out.println("\nTotal Languages: "+ languages.size());

        sc.close();
    }
}
