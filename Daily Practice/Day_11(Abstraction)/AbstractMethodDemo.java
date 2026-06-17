// Abstract method ki body nahi hoti
// Child class ko implement karna padta hai
abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is Barking...");
    }
}
public class AbstractMethodDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
