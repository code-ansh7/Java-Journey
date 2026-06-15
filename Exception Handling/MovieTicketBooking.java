import java.util.*;
class NotEligibleException extends Exception{
    NotEligibleException(String msg){
        super(msg);
    }
}
public class MovieTicketBooking{
    static void Validity(int age) throws NotEligibleException{ 
        if(age < 18) throw new NotEligibleException("You must be 18+ to watch this Movie!");
        System.out.println("Ticket booked Successfully...");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            Validity(age);
        }
        catch(NotEligibleException e){
            System.out.println(e.getMessage());
        }
    }
}
