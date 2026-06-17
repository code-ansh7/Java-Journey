 // Variables inside Interface

interface Animal {

    // By default:
    // public static final
    int AGE = 18;
}

public class InterfaceVariablesDemo {

    public static void main(String[] args) {

        System.out.println(Animal.AGE);

        // Animal.AGE = 20; // Compile Error
    }
}