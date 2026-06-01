import java.util.Scanner;
public class EvenOddFunction {
    public static boolean checkEvenOdd(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        if(checkEvenOdd(n)){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }
     }
}
