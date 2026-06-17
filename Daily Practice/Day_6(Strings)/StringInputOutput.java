import java.util.*;
public class StringInputOutput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your String: ");
        String str = sc.nextLine();

        System.out.println("Your String: " + str);
        System.out.println("String Size: " + str.length());

        for(int i = 0; i < str.length(); i++){
            System.out.println(i + " : " + str.charAt(i));
        }
    }
}