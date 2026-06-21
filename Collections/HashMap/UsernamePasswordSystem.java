import java.util.*;
public class UsernamePasswordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many User's ? ");
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String , String> users = new HashMap<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter Username " + i + ": ");
            String name = sc.nextLine();
            System.out.print("Enter Password " + i + ": ");
            String password = sc.nextLine();
             users.put(name,password);
        }
        System.out.println("Your User's: " +  users);
        System.out.print("Enter Username to search: ");
        String target = sc.nextLine();
        if(users.containsKey(target)) 
            System.out.println(target + " : " + users.get(target));
        else
            System.out.println("Contact not found!");
    }
}
