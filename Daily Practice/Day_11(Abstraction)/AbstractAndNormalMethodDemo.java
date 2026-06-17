// Abstract class ke andar
// abstract aur normal dono methods ho sakte hain
abstract class Employee{
    abstract void work();
    void login(){
        System.out.println("Log-in Successfully...");
    }
    void logout(){
        System.out.println("Logout Successfully...");
    }
}
class Doveloper extends Employee{
    void work(){
        System.out.println("Writing code...");
    }
}
class Tester extends Employee{
    void work(){
        System.out.println("Testing the Application and Website...");
    }
}
public class AbstractAndNormalMethodDemo {
    public static void main(String[] args) {
        Doveloper Ansh = new Doveloper();
        Ansh.login();
        Ansh.work();
        Ansh.logout();

        System.out.println();

        Tester Vansh = new Tester();
        Vansh.login();
        Vansh.work();
        Vansh.logout();
    }
}
