class Student{
    private String name;
    private int marks;

    void setMarks(int marks){
        if(marks > 0 && marks <= 100){
            this.marks = marks;
        }
        else{
            System.out.println("Invalid Marks...");
        }
    }
    int getMarks(){
        return marks;
    }
}
public class StudentValidationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(99);
        s1.setMarks(150);
        System.out.println("Marks: " + s1.getMarks());
    }
}
