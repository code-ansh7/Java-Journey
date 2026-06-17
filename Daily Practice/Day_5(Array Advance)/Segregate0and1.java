import java.util.*;
public class Segregate0and1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter Array elements : ");
    for(int i = 0; i < s; i++){
        arr[i] = sc.nextInt();
    }
    int numberOfZeros = 0;
    int numberOfOnes = 0;
    for (int idx = 0; idx < arr.length; idx++) {
        if(arr[idx] == 0) numberOfZeros++;
        else numberOfOnes++;    
    }
    for (int idx = 0; idx < numberOfZeros; idx++) {
        arr[idx] = 0;
    }
    for (int idx = numberOfZeros; idx < arr.length; idx++) {
        arr[idx] = 1;
    }
    System.out.println("Your array is: ");
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
  }
}
