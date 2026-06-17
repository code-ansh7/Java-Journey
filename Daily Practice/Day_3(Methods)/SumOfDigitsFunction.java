import java.util.*;
public class SumOfDigitsFunction {
    public static int sum(int n){
        int s = 0;
        int d;
        while(n > 0){
            d = n % 10;
            s = s + d;
            n = n / 10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits : "+ sum(n));
    }
}
