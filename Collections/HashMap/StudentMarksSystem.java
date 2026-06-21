import java.util.*;
public class StudentMarksSystem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Students ? ");
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> marks = new HashMap<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter Student " + i + ": ");
            String s = sc.nextLine();
            System.out.print("Enter Marks " + i + ": ");
            int m = sc.nextInt();

            sc.nextLine();
            marks.put(s,m);
        }
        System.out.println(marks);
        System.out.print("Enter student name to search: ");
        String target = sc.nextLine();
        if(marks.containsKey(target)) System.out.println(target + " = " + marks.get(target));
        else System.out.println("Student not found!");
    }
}
