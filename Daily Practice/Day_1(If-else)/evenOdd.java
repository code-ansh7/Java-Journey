import java.util.Scanner;

class evenOdd {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter your number : ");
      int num = sc.nextInt();
      
      if (num % 2 == 0) {
         System.out.println(num + " is Even a Number.");
      } else {
         System.out.println(num + " is Odd a Number.");
      }

   }
}
