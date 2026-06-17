import java.util.*;
public class StudentSearchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> student = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.print("Enter " + i + " Student name: ");
            String name = sc.nextLine();
            student.add(name);
        }
        System.out.print("Enter student name to search: ");
        String target = sc.nextLine();
        if(student.contains(target)){
            System.out.println(target + " present in List!");
        } else {
            System.out.println(target + " is not present in List!");
        }
        for(String naam : student){ // naam is a variable that stores list item one by one 
            System.out.println(naam);
        }
    }
}
