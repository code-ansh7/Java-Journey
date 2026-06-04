import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
              result = result +  Character.toLowerCase(str.charAt(i));
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
              result = result + Character.toUpperCase(str.charAt(i));
            }   
            else {
                result = result + str.charAt(i);
            }    
    }  
        System.out.println(str);  
        System.out.println(result);
  }
}
