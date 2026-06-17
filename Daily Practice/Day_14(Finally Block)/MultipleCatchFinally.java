import java.util.*;
public class MultipleCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter size: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.print("Enter array elements: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(arr[0] / arr[1]);

                System.out.println(arr[5]);
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println("Error!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println("Error!");
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println("Error!");
            }
            finally{
                System.out.println("Finally block!");
            }
            System.out.println();
            System.out.println("Program end!");
    }
  }
}
