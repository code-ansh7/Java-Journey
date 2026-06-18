import java.util.*;

public class TrainCoachManager {

    public static void main(String[] args) {

        LinkedList<String> train = new LinkedList<>();

        // Normal coaches add
        train.add("Coach-1");
        train.add("Coach-2");
        train.add("Coach-3");

        // Engine ko beginning me add kiya
        train.addFirst("Engine");

        // Guard coach ko last me add kiya
        train.addLast("Guard Coach");

        System.out.println("Train: " + train);

        // First coach
        System.out.println("First Coach: " + train.getFirst());

        // Last coach
        System.out.println("Last Coach: " + train.getLast());

        // Total coaches
        System.out.println("Total Coaches: " + train.size());

        // Remove Coach-1
        train.remove(1);

        System.out.println("Updated Train: " + train);
    }
}