import java.util.*;
public class ProductPriceManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Products ? ");
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String , Long> products = new HashMap<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter Product Name " + i + ": ");
            String name = sc.nextLine();
            System.out.print("Enter Product Price " + i + ": ");
            long price = sc.nextLong();
            sc.nextLine();
            products.put(name,price);
        }
        System.out.println("Your Product List: " + products);
        System.out.print("Enter Product name to search: ");
        String target = sc.nextLine();
        if(products.containsKey(target)) 
            System.out.println(target + " : " + products.get(target));
        else
            System.out.println("Product not found!");

        System.out.print("Enter Product to Remove: ");
        String p = sc.nextLine();
        if(!products.containsKey(p))
            System.out.println("Product not found!");
        else{
            products.remove(p);
            System.out.println("Updated Product List: " + products);
        }

    }
}
