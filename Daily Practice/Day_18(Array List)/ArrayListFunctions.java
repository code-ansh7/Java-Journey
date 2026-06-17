import java.util.*;
public class ArrayListFunctions {

    public static void main(String[] args) {
        // Dynamic Array
        ArrayList<String> languages = new ArrayList<>();

        // Check list empty hai ya nahi
        System.out.println("Is List Empty? " + languages.isEmpty());

        // add() -> element add karta hai
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Languages: " + languages);

        // size() -> total elements count karta hai
        System.out.println("Total Languages: " + languages.size());

        // get() -> specific index ka element deta hai
        System.out.println("First Language: " + languages.get(0));

        // set() -> existing element update karta hai
        languages.set(1, "JavaScript");

        System.out.println("After Update: " + languages);

        // contains() -> check karta hai element present hai ya nahi
        System.out.println("Contains Java? " + languages.contains("Java"));

        // remove() -> element delete karta hai
        languages.remove(2);
        System.out.println("After Remove: " + languages);

        // clear() -> puri list empty kar deta hai
        languages.clear();
        System.out.println("After Clear: " + languages);

        // isEmpty() dobara check
        System.out.println("Is List Empty Now? " + languages.isEmpty());
    }
}