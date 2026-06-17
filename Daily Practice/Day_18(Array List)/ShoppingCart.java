import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("How many items? ");
        int n = sc.nextInt();

        sc.nextLine();
        
        ArrayList<String> items = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter " + i + " Item: ");
            String item = sc.nextLine();
            items.add(item);
        }
        System.out.println("Items you Cart: " + items);
        System.out.print("Enter index to remove: ");
        int idx = sc.nextInt();
        items.remove(idx);
        System.out.println("Updated Cart: " + items);
        System.out.println("Updated size: " + items.size());
    }
}
