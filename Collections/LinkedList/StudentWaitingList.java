import java.util.*;
public class StudentWaitingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Students ? ");
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> waitingList = new  LinkedList<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter Student " + i + ": " );
            waitingList.addLast(sc.nextLine());
        }

        System.out.print("Enter Student to search: ");
        if(waitingList.contains(sc.nextLine())){
            System.out.println("Student Found!");
        } else {
            System.out.println("Student not Found!");
        }
        
        System.out.println("Students List: " + waitingList);
        System.out.println("First Student: " + waitingList.getFirst() + "\nLast Student: " + waitingList.getLast());
    }
}
