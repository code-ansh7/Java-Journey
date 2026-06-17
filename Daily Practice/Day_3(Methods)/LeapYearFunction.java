import java.util.Scanner;
public class LeapYearFunction {
    public static boolean leapYear(int year){
        if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if(leapYear(year)){
            System.out.println(year + " is a leap Year");
        }
        else{
            System.out.println(year + " is not a leap Year");
   
        }
    }
}
