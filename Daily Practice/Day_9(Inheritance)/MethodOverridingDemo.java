import javax.sound.sampled.SourceDataLine;

class Animal{
    void sound(){
    System.out.println("Animal Sound...");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Dog barks...");
    }
}
class cat extends Animal{

    void sound(){
        System.out.println("Meow...");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.sound();

        cat c1 = new cat();
        c1.sound();
    }
}
