import java.util.Scanner;
public class sumOfDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        int d;
        while(n > 0){
            d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        System.out.println("Sum of Digits : "+ sum);
    }
}
