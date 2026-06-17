class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
     void sound() {
        System.out.println("Dog Bark");
    }

    void bark() {
        System.out.println("Dog is Barking...");
    }
}

public class RuntimePolymorphismDemo {

    public static void main(String[] args) {

        // Parent reference + Child object
        Animal a = new Dog();

        // Dog wala sound() chalega because method overriding
        a.sound();

        // a.bark();   // Compile Error
        // Reason:
        // Reference type Animal hai,
        // aur Animal class mein bark() method nahi hai.
    }
}