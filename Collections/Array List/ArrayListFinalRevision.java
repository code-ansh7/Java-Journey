import java.util.*;
public class ArrayListFinalRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Enter '5' Numbers========");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + " : ");
            int num = sc.nextInt();
            nums.add(num);
        }
        System.out.println("Numbers : " + nums);

        Collections.reverse(nums);
        System.out.println("Reverse List: " + nums);

        Collections.sort(nums);
        System.out.println("Sorted Numbers : " + nums);

        System.out.print("Enter number you want to search: ");
        int k = sc.nextInt();
        int idx = nums.indexOf(k);//gives index of the value
        if(nums.contains(k)) System.out.println(k + " is found at index " + idx);
        else System.out.println(k + " is not found!");

        nums.remove(nums.size()-1);
        System.out.println("Updated Numbers: " + nums);

        System.out.println("Using for loop:");
        for(int i = 0; i < nums.size(); i++) System.out.print(nums.get(i) + " ");

        System.out.println();

        System.out.println("Using for each loop:");
        for(Integer num : nums) System.out.print(num + " ");
    }
}
