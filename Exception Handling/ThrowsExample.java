public class ThrowsExample {
    // Ye method warning de raha hai
    static void divide(int a, int b) throws ArithmeticException 
    {
        if(b == 0){
            throw new ArithmeticException("Dinominator is zero!");
        }
        System.out.println(a / b);

    }

    public static void main(String[] args) {

        try {

            divide(10, 0);

        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println("Exception Handled");
            System.out.println(e.getMessage());
        }

        System.out.println("Program End");
    } 
}
