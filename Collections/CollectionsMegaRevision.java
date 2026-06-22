import java.util.*;
public class CollectionsMegaRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =====================================================
        // ARRAYLIST REVISION
        // =====================================================

        // ArrayList stores ordered data and allows duplicates
        ArrayList<String> languages = new ArrayList<>();

        System.out.print("How many programming languages? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Taking language names from user
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter Language " + i + ": ");
            languages.add(sc.nextLine());
        }

        System.out.println("\nArrayList Data: " + languages);

        // Traversing ArrayList using for-each loop
        System.out.println("\nTraversing ArrayList:");
        for(String lang : languages) {
            System.out.println(lang);
        }

        // =====================================================
        // LINKEDLIST REVISION
        // =====================================================

        // LinkedList stores data using nodes
        LinkedList<String> websites = new LinkedList<>();

        System.out.print("\nHow many websites visited? ");
        int w = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= w; i++) {
            System.out.print("Enter Website " + i + ": ");
            websites.add(sc.nextLine());
        }

        System.out.println("\nLinkedList Data: " + websites);

        // Displaying first and last website
        System.out.println("First Website: " + websites.getFirst());
        System.out.println("Last Website: " + websites.getLast());

        // =====================================================
        // HASHSET REVISION
        // =====================================================

        // HashSet stores only unique elements
        HashSet<String> cities = new HashSet<>();

        System.out.print("\nHow many city names? ");
        int c = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= c; i++) {
            System.out.print("Enter City " + i + ": ");
            cities.add(sc.nextLine());
        }

        // Duplicate cities will be ignored automatically
        System.out.println("\nUnique Cities: " + cities);

        System.out.println("Total Unique Cities: " + cities.size());

        // =====================================================
        // HASHMAP REVISION
        // =====================================================

        // HashMap stores data in Key -> Value format
        HashMap<String,Integer> marks = new HashMap<>();

        System.out.print("\nHow many students? ");
        int s = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= s; i++) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int mark = sc.nextInt();
            sc.nextLine();

            marks.put(name, mark);
        }

        System.out.println("\nStudent Records: " + marks);

        // Searching a student using key
        System.out.print("\nEnter Student Name To Search: ");
        String target = sc.nextLine();

        if(marks.containsKey(target)) {
            System.out.println(target + "'s Marks: " + marks.get(target));
        }
        else {

            System.out.println("Student Not Found!");
        }

        // Traversing HashMap
        System.out.println("\nTraversing HashMap:");

        for(String key : marks.keySet()) {
            System.out.println(key + " -> " + marks.get(key));
        }

        // =====================================================
        // FINAL COLLECTIONS SUMMARY
        // =====================================================

        System.out.println("\n===== COLLECTIONS SUMMARY =====");

        System.out.println("ArrayList Size: " + languages.size());

        System.out.println("LinkedList Size: " + websites.size());

        System.out.println("HashSet Size: " + cities.size());

        System.out.println("HashMap Size: " + marks.size());

        sc.close();
    }
}
