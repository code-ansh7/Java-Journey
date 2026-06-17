class BankAccount{
    String accountHolder;
    private int balance;

    public BankAccount() {

    }
    
    BankAccount(String accountHolder, int balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(int amount){
        balance = balance + amount;
    }

    void withdraw(int amount){
        if(amount <= balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient Balance...");
        }
    }

    void displayBalance(){
         System.out.println("Account Balance: " + balance);
    }
}
public class BankAccountEncapsulationDemo {
    public static void main(String args[]){
        BankAccount acc = new BankAccount("Ansh", 5000);
        acc.displayBalance();
        acc.deposit(2000);
        acc.displayBalance();
        acc.withdraw(1000);
        acc.displayBalance();
    }
}
