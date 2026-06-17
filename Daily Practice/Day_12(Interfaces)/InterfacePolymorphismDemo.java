interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog bark...");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Cat Meow...");
    }
}
public class InterfacePolymorphismDemo {
    public static void main(String[] args) {
        Animal a;
        a = new Dog(); //Runtime Polymorphism.
        a.sound();

        a = new Cat();
        a.sound();
    }
}
