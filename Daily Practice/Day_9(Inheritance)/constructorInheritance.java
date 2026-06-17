class Animal{
     Animal(){
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal{
     Dog(){
        System.out.println("Dog Constructor");
    }
}
public class constructorInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
     }
}
