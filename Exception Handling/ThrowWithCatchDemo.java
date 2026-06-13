public class ThrowWithCatchDemo {
    public static void main(String[] args) {
        try {
            //manually genrating exception.
            throw new ArithmeticException("Error Genrated!");
        } catch (Exception e) {
            System.out.println("Error Hndled");
            System.out.println(e);

        }
        System.out.println("Program end!");
    }
}
