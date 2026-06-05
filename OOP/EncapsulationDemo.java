 class Student {

    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {

        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        }
        else{
            System.out.println("Invalid Marks!");
        }
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Ansh");
        s1.setMarks(110);

        System.out.println("Name : " + s1.getName());
        System.out.println("Marks : " + s1.getMarks());
    }
}
