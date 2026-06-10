/*
Interface vs Abstract class:

Abstract class:
    *Use extends
    *Can have abstract and normal methods
    *Can have constructors
    *Can have variables

Interface:
    *Uses implemnts 
    *Methods are public abstract by default
    *Cannot create object 
    *Defines rules for classes
*/
interface Animal{
    void sound();
}
abstract class Dog implements Animal{

}
class Puppy extends Dog{
    public void sound(){
        System.out.println("Puppy Bark...");
    }
}
public class AbstractClassWithInterface{
    public static void main(String[] args){
        Puppy p = new Puppy();
        p.sound();
    }
}
