import java.util.*;
public class ArrayListTraversalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();
        System.out.println("========Enter '5' Books name========");
        for(int i = 1; i <= 5; i++){
            System.out.print("Enter Book '" + i + "' : ");
            String book = sc.nextLine();
            books.add(book);
        }
        // for loop me index milta hai
        for(int i = 0; i < books.size(); i++) System.out.print(books.get(i) + " ");
        System.out.println();
        // for-each me sirf element milta hai
        for(String book : books) System.out.print(book + " ");
    }
}
