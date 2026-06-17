import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    int d;
    int rev = 0;
    while(n > 0){
        d = n % 10; // find last digit
        rev = (rev*10) + d; // add in reverse order 
        n = n / 10;  //for decrement 
    }
    System.out.println("Reverse Number : " + rev );
  }  
}
