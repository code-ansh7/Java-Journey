class Animal{
    String name = "Animal";
     void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    String name = "Dog";
     void sound(){
        System.out.println("Dog Bark");
    }
    void display(){
        System.out.println(name);
        // super = Parent class ke variables aur methods ko access karne ke liye use hota hai.
        System.out.println(super.name);
        //accessing method of perent class.
        sound();
        super.sound();
    }
}
public class superKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
