import java.util.*;
public class UniqueCityNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Cities ? ");
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> cities = new HashSet<>();
         for(int i = 1; i <= n; i++){
            System.out.print("Enter City " + i + ": ");
            cities.add(sc.nextLine());
        }
        System.out.println("Unique Cities List: " + cities);  
    }
}
