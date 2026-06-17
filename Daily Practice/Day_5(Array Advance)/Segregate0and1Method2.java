import java.util.*;
public class Segregate0and1Method2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size : ");
    int s = sc.nextInt();
    int[] arr = new int[s];
    System.out.println("Enter Array elements : ");
    for(int i = 0; i < s; i++){
        arr[i] = sc.nextInt();
    }
    int n = arr.length;
    int i = 0;
    int j = n -1;
    while(i < j){
        if(arr[i] == 0) i++;
        else if(arr[j] == 1) j--;
        else if(arr[i] == 1 && arr[j] == 0){
            arr[i] = 0;
            arr[j] = 1;
            i++;
            j--;
        }
    }
    for (int idx = 0; idx < arr.length; idx++) {
        System.out.print(arr[idx] + " ");        
    }
  }
}
