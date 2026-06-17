import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {

    // Constructor
    Calculator() {
        System.out.println("Calculator Started Successfully...");
    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    float divide(float a, float b) {

        // Custom Validation using throw
        if (b == 0) {
            throw new ArithmeticException(
                    "Denominator cannot be zero!");
        }

        return a / b;
    }
}

public class CalculatorByOOPS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator c = new Calculator();

        int operationCount = 0;

        while (true) {

            try {

                System.out.println("\n========================");
                System.out.println("    JAVA CALCULATOR");
                System.out.println("========================");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                System.out.println("========================");

                System.out.print("Enter Your Choice : ");
                int ch = sc.nextInt();

                if (ch == 1) {

                    System.out.print("Enter First Number : ");
                    int a = sc.nextInt();

                    System.out.print("Enter Second Number : ");
                    int b = sc.nextInt();

                    System.out.println("Result : " + c.add(a, b));

                    operationCount++;
                }

                else if (ch == 2) {

                    System.out.print("Enter First Number : ");
                    int a = sc.nextInt();

                    System.out.print("Enter Second Number : ");
                    int b = sc.nextInt();

                    System.out.println("Result : " + c.subtract(a, b));

                    operationCount++;
                }

                else if (ch == 3) {

                    System.out.print("Enter First Number : ");
                    int a = sc.nextInt();

                    System.out.print("Enter Second Number : ");
                    int b = sc.nextInt();

                    System.out.println("Result : " + c.multiply(a, b));

                    operationCount++;
                }

                else if (ch == 4) {

                    System.out.print("Enter First Number : ");
                    float a = sc.nextFloat();

                    System.out.print("Enter Second Number : ");
                    float b = sc.nextFloat();

                    System.out.println(
                            "Result : " + c.divide(a, b));

                    operationCount++;
                }

                else if (ch == 5) {

                    System.out.println(
                            "Thank You For Using Calculator!");

                    System.out.println(
                            "Total Operations Performed : "
                                    + operationCount);

                    break;
                }

                else {

                    System.out.println(
                            "Invalid Choice! Please Try Again.");
                }

            }

            // Handles wrong input
            catch (InputMismatchException e) {

                System.out.println(
                        "Please Enter Numbers Only!");

                sc.nextLine(); // clear buffer
            }

            // Handles divide by zero
            catch (ArithmeticException e) {

                System.out.println(
                        "Error : " + e.getMessage());
            }

            catch (Exception e) {

                System.out.println(
                        "Something Went Wrong!");
            }
        }

        sc.close();

        System.out.println(
                "Calculator Closed Successfully.");
    }
}