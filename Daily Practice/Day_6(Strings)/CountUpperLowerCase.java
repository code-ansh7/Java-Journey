import java.util.*;
public class CountUpperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int upper = 0;
        int lower = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upper++;
            }
           if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lower++;
            }       
        }
        System.out.println("Upper: " + upper + "\nLower: " + lower);
    }
}
