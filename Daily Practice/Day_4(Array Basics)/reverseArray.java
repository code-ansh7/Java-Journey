import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter Array elements : ");
    for(int i = 0; i < s; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("Your Array is : [");
    for(int i = arr.length-1; i >= 0; i--){
        System.out.print(arr[i] +",");
    }
    System.out.print("]");

  }  
}
