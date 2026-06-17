import java.util.Arrays;

public class shallowCopyDeepCopy{
    public static void main(String[] args) {
        //In shallow copy another variable just point to the address not make duplicate array
        int[] arr = {10,20,30,40};
        int[] shallow = arr;
        shallow[1] = 50;
        System.out.println(arr[1]);// arr[1] bhi change ho gya 
        
        System.out.println();

        //In deep copy java crreate a new array and assign all values to new array
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[1] = 60;
        System.out.println(arr[1]);//here deep is not change 
    }
}