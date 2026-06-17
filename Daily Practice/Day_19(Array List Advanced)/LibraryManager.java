import java.util.*;
public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Books: ");
        int  n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> books = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter Book '" + i + "' : ");
            String name =  sc.nextLine();
            books.add(name);
        }
        System.out.println("Books : " + books);
        System.out.print("Enter book you want to seaarch: ");
        String s = sc.nextLine();
        if(books.contains(s)) System.out.println(s + " is found in List!");
        else System.out.println(s + " is not found in List");
        System.out.print("Enter book index you want to be remove: ");
        int r = sc.nextInt();
        books.remove(r);
        System.out.println("Total books: " + books.size());
        for(String book : books) System.out.print(book + " ");
    }
}
