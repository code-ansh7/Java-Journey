//abstract class can have constructors.
abstract class Animal{
    Animal() {
        System.out.println("Animal constructor!");
    } 
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor!");
    }
}
public class AbstractConstructorDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
