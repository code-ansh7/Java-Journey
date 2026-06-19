import java.util.*;
public class TrainRouteManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Stations ? ");
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> route = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter " + i + " Station: ");
             route.add(sc.nextLine());
        }
        System.out.print("Enter your boarding station: ");
        route.addFirst(sc.nextLine());

        System.out.print("Enter your destination: ");
        route.addLast(sc.nextLine());

        System.out.println("Your Route: " + route);

        System.out.println("Your Boarding Station: " + route.getFirst());
        System.out.println("Your Destination: " + route.getLast());

        route.removeFirst();
        route.removeLast();
        System.out.println("Your Middile Stations: " + route);
    }
}
