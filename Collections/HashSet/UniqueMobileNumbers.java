import java.util.*;
public class UniqueMobileNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers ? ");
        int n = sc.nextInt();
        HashSet<Long> numbers = new HashSet<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter Number " + i + ": ");
            numbers.add(sc.nextLong());
        }
        System.out.println("Unique Number's: " + numbers);
    }
}
