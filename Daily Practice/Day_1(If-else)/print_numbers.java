import java.util.Scanner;
public class print_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= 10; i++){
             System.err.print(i+"  ");
        }
        System.err.println("");
        for(int i = 10; i >= 0; i--){
             System.err.print(i+"  ");
        }
     }
}
