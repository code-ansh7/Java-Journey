import java.util.Scanner;
public class mergeTwoArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first Array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter first array elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second Array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter second array elements: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[n1+n2];
        for(int i = 0; i < n1; i++){
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < n2; i++){
            arr3[i + n1] = arr2[i];
        }
        System.out.println("Your merge array is: ");
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
 
    }
}
