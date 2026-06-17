 class Student {

    String name;
    int marks;

    Student() { // default constructer...
        System.out.println("Object Created...");
    }
    Student(String name, int marks){ // perameterized constructer...
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println(name + " got " + marks + " marks.");
    }
}

public class constructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Ansh", 90);
        s1.display();
    }
}