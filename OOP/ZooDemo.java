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
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    } 
}

public class ZooDemo {

    // Same method can work with Dog, Cat, Cow etc.
    public static void makeSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {

        // Dog object passed
        makeSound(new Dog());

        // Cat object passed
        makeSound(new Cat());
    }
}
