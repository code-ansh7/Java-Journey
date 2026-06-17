// throw + catch + finally

public class ThrowWithFinallyDemo {

    public static void main(String[] args) {

        try {

            throw new ArithmeticException("Error");

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Exception Handled");
        }
        finally {

            System.out.println("Cleanup Done");
        }

        System.out.println("Program End");
    }
}