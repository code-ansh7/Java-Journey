 class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    // @Override
    void sound() {
        System.out.println("Dog Bark");
    }

    void bark() {
        System.out.println("Dog is Barking...");
    }
}

public class DowncastingDemo {

    public static void main(String[] args) {

        Animal a = new Dog();

        // Downcasting
        Dog d = (Dog)a;
        d.sound();
        d.bark();
    }
}