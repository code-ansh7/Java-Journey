class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class Puppy extends Dog{
    void play(){
        System.out.println("Playing");
    }
} 
 
public class multiLevelInheritance {
    public static void main(String[] args) {
        Puppy p1 = new Puppy();
        p1.eat();
        p1.bark();
        p1.play();
    }
}
