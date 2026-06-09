//A abstract class can also inherit other abtract classes
abstract class Animal{
    abstract void sound();
}
abstract class Dog extends Animal{
    abstract void bark();
}
class Puppy extends Dog{
    @Override
    void bark(){
        System.out.println("Barking...");
    }
    void sound(){
        System.out.println("Cute Puppy Barking...");
    }
}
public class MultiLevelAbstractDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.bark();
        p.sound();
    }
}
