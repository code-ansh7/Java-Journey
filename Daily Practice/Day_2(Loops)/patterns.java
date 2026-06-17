import java.util.Scanner;
public class patterns{
  public static void squarePattern(int n){  
        System.out.println("Your Square...");   
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
  }
  public static void trianglePatterjn(int n){
        System.out.println("Your Triangle...");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
  }
  public static void downwardTrianglePatterjn(int n){
        System.out.println("Your Downward Triangle...");
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
  }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();
        squarePattern(n);
        trianglePatterjn(n);
        downwardTrianglePatterjn(n);
    }
}