// ======================================
// Inheritance
// Parent class ki properties aur methods
// child class ko mil jana.
// Example: Dog extends Animal
// ======================================
class Animal{
    void sound(){
        System.out.println("Animal Sound...");
    }
}
class dog extends Animal{

}
public class InheritanceDemo {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();
    }
}
