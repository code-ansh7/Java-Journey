 public class ExceptionTypeDemo {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            System.out.println(a / b);

        }
        catch(Exception e) {

            // Prints complete exception
            System.out.println("Exception : " + e);

            // Prints exception class name
            System.out.println("Exception Type : " + e.getClass().getName());

            // Prints only error message
            System.out.println("Message : " + e.getMessage());
        }
    }
}