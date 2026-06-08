class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }

    void bark() {
        System.out.println("Dog is Barking...");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class PolymorphismCompleteDemo {

    public static void main(String[] args) {

         // Runtime Polymorphism + Upcasting
        // Parent reference holding child object
        Animal a = new Dog();

        // Dog object hai, isliye Dog wala sound() chalega
        a.sound();

        // Ye line error degi
        // Reference type Animal hai
        // Animal class mein bark() method nahi hai

        // a.bark();


         // instanceof
        // Check kar rahe hain ki object Dog ka hai ya nahi

        System.out.println(a instanceof Dog);      // true
        System.out.println(a instanceof Animal);   // true
        System.out.println(a instanceof Cat);      // false

         // Downcasting
 
        // Animal reference ko Dog reference mein convert kiya

        Dog d = (Dog)a;

        d.sound();
        d.bark();

         // Runtime Polymorphism
        // Same reference, different objects
 
        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}
