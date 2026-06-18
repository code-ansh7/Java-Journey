import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> lang = new LinkedList();
        lang.add("Java");
        lang.add("Python");
        lang.add("C++");
        lang.add("C");

        System.out.println("Linked List: " + lang);

        System.out.println("Size: " + lang.size());

        System.out.println("First Element: " + lang.get(0));
        System.out.println("Last Element: " + lang.get(lang.size()-1));

        lang.remove(1);
        System.out.println("Updated Linked List: " + lang);
    }
}
