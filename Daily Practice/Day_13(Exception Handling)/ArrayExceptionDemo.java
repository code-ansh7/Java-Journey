import java.util.*;
public class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = new int[5];
            System.out.print("Enter '5' Araay elements: ");
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter position to access: ");
            int p = sc.nextInt();
            System.out.println(arr[p]);
        }
        catch(Exception e){
            System.out.println("Error...");
            System.out.println(e);
        }
        System.out.println("Program end!");
    }
}
