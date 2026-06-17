class Student{
    String name;
    int marks;
}

class Mobile{
    String brand;
    int price;
}

class Car {
    String company;
    String model;
    int price;
}
public class oopsDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name =  "Ansh";
        s1.marks = 90;
        System.out.println(s1.name + " got " + s1.marks + " marks.");

        Mobile m1 = new Mobile();
        m1.brand = "Redmi";
        m1.price = 6000;
        System.out.println(m1.brand + " is avilable on '" + m1.price + "' Rupees.");

        Car c1 = new Car();
        c1.company = "Mahindra";
        c1.model = "Scorpio";
        c1.price = 2000000;
        System.out.println(c1.company + " " + c1.model + " price is: " + c1.price);
    }
}
