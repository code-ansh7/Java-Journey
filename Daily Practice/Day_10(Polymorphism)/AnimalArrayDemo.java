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

class Cat extends Animal {
    // @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    // @Override
    void sound() {
        System.out.println("Moo");
    }
}

public class AnimalArrayDemo {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        for(int i = 0; i < animals.length; i++) {
            animals[i].sound();
        }
    }
}