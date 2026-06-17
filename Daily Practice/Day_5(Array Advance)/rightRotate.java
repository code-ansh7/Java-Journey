import java.util.*;
public class rightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[arr.length -1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println("Your right rotate array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
