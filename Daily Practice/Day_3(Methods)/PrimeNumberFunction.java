import java.util.Scanner;
public class PrimeNumberFunction {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i=2; i <= (n-1); i++){
            if(n % i == 0){
                count ++;
                break;
            }
        }
        if(count == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is not Prime.");    
        }
    }
}
