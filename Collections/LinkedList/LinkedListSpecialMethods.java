
import java.util.LinkedList;

public class LinkedListSpecialMethods {
    public static void main(String[] args) {
        LinkedList<String> lang = new LinkedList<>();
        lang.add("Java");
        lang.add("Python");
        lang.add("C++");
        lang.add("C");

        System.out.println("List: " + lang);

        lang.addFirst("Dart");
        lang.addLast("Flutter");
        System.out.println("Updated List: " + lang);

        System.out.println("First element: " + lang.getFirst());
        System.out.println("Last element: " + lang.getLast());
      
    }
}
