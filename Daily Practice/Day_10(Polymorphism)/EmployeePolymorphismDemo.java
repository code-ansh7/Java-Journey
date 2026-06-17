class Employee {

    void work() {
        System.out.println("Employee Working");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Writing Code...");
    }
}

class Tester extends Employee {

    @Override
    void work() {
        System.out.println("Testing Application...");
    }
}

public class EmployeePolymorphismDemo {

    public static void main(String[] args) {

        // Same array holding different child objects
        Employee[] employees = {
                new Developer(),
                new Tester()
        };

        // Runtime decides which work() method should run with for each loop.
        for (Employee e : employees) {
            e.work();
        }
    }
}