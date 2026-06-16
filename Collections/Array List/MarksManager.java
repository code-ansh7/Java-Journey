import java.util.*;
public class MarksManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Student's: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> marks = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter " + i + " student's marks: ");
            int m = sc.nextInt();
            marks.add(m);
        }
        System.out.println("Marks List: " + marks);
        System.out.println("Marks of second student: " + marks.get(1));
        System.out.print("Enter index to remove: ");
        int idx = sc.nextInt();
        marks.remove(idx);
        System.out.println("Updated marks list: " + marks);
        System.out.println("Updated size: " + marks.size());
    }
}
