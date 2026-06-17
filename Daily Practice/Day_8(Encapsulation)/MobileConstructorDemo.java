class Mobile{
    String brand;
    int price;
    Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    void display(){
        System.out.println(brand + " price is: " + price);
    }
}

public class MobileConstructorDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Redmi", 6000);
        m1.display();
    }
}
