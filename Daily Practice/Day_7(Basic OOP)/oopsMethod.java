class Student{
    String name;
    int marks;
    void display(){
        System.out.println(name + " got " + marks + " marks.");
    }
}

class Mobile{
    String brand;
    int price;
    void display(){
        System.out.println(brand + " is avilable on '" + price + "' Rupees.");
    }
}

class Car {
    String company;
    String model;
    int price;
    void display(){
        System.out.println(company + " " + model + " price is: " + price);
    }
}
public class oopsMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ansh";
        s1.marks = 90;
        s1.display();

        Mobile m1 = new Mobile();
        m1.brand = "Redmi";
        m1.price = 6000;
        m1.display();

        Car c1 = new Car();
        c1.company = "Mahindra";
        c1.model = "Scorpio";
        c1.price = 2000000;
        c1.display();
    }
}
