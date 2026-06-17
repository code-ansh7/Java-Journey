// One class implementing multiple interfaces

interface Animal {

    void sound();
}

interface Pet {

    void play();
}

class Dog implements Animal, Pet {

    @Override
    public void sound() {
        System.out.println("Dog Bark");
    }

    @Override
    public void play() {
        System.out.println("Dog Playing");
    }
}

public class MultipleInterface {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.play();
    }
}