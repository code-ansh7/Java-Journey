import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter Array elements : ");
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter element you want to search : ");
    int s = sc.nextInt();
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == s){
            System.out.println("Your element found at Index " + i);
        }
        else {
            System.out.println("Your element is not in the array.");
        }
     }
  }
}