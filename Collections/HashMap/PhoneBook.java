import java.util.*;
public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Contacts ? ");
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String , Long> phonebook = new HashMap<>();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter name " + i + ": ");
            String name = sc.nextLine();
            System.out.print("Enter Phone Number " + i + ": ");
            long phoneNumber = sc.nextLong();
            sc.nextLine();
            phonebook.put(name,phoneNumber);
        }
        System.out.println("Your Phone Number's: " + phonebook);
        System.out.print("Enter contact name to search: ");
        String target = sc.nextLine();
        if(phonebook.containsKey(target)) 
            System.out.println(target + " : " + phonebook.get(target));
        else
            System.out.println("Contact not found!");
    }
}
