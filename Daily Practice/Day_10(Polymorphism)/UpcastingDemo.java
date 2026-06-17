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
}

public class UpcastingDemo {
    public static void main(String[] args) {
        // Upcasting
        Animal a = new Dog();
        a.sound();
    }
}