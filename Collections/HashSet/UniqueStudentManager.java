import java.util.*;
public class UniqueStudentManager {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Students ? ");
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> students = new HashSet<>();
         for(int i = 1; i <= n; i++){
            System.out.print("Enter Student " + i + ": ");
            students.add(sc.nextLine());
        }
        System.out.println("Unique Students List: " + students);
    }
}
