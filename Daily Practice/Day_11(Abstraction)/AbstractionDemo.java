//We can not create object of Abstract class.
//Abstaction is only for Inheritance.
abstract class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{

}

public class AbstractionDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        // Animal a = new Animal();  => error dega.
    }
}