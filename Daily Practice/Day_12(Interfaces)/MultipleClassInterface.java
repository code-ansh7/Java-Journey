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
public class MultipleClassInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();
    }
}
