import java.util.*;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        boolean isPalindrome = false;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(str.length() - i -1)){
                isPalindrome = true;
            }
        }
        if(isPalindrome){
            System.out.println("String is Palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
        
    }
}
