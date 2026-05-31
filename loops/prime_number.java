import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                count += 1;
                break;
            }
        }
        if(count == 0){
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is not Prime.");
      
        }
    }
}
