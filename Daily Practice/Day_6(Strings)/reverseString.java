import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Your reverse String: ");
        for(int i = (str.length() - 1); i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
