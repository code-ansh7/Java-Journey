import java.util.*;
public class CountEvenOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter Array elements : ");
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
    int even = 0, odd = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] % 2 == 0){
            even++;
        }
        else {
            odd++;
        }
    }
    System.out.println("Even : " + even + "\nOdd : " + odd);
  }
}
