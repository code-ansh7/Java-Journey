import java.util.*;
public class reverseArrayTwoPointer {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter Array elements : ");
    for(int i = 0; i < s; i++){
        arr[i] = sc.nextInt();
    }
    int i =0;
    int j = arr.length - 1;
    while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }
    System.out.print("Your Array is : ");
    for (int idx = 0; idx < arr.length; idx++) {
         System.out.print(arr[idx] + " ");
    }
  }
}
