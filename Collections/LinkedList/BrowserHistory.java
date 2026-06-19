import java.util.*;
public class BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Websites Visited ? ");
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> history = new LinkedList<>();
        for(int i = 1; i <=n; i++){
            System.out.print("Enter your " + i + " Website: ");
            String web = sc.nextLine();
            history.addFirst(web); // Latest web is always added at first position
        }
        if(history.isEmpty()) System.out.println("No Website Found!");

        System.out.println("Your Web History: " + history);

        System.out.println("Latest Website: " + history.getFirst());
        
        history.removeFirst();
        System.out.println("After removing Latest Website: " + history);
    }
}
