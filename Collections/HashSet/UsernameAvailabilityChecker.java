import java.util.*;
public class UsernameAvailabilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many User's ? ");
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> users = new HashSet<>();
         for(int i = 1; i <= n; i++){
            System.out.print("Enter Username " + i + ": ");
            users.add(sc.nextLine());
        }
        System.out.print("Enter Username to check: ");
        String user = sc.nextLine();
        if(!users.contains(user)){
            System.out.print("Username Avilable!");
        } else {
            System.out.println("Username Already exist!");
        }
    }
}
