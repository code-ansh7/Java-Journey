import java.util.*;
public class countOccourance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter your occourance element: ");
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k) {
                count++;
            }
        }
        System.out.print(k + " is present in Array " + count + " times.");
    }
}
