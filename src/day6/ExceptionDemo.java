package day6;

//Exception handling
//1: Division & Array Access
//Write a Java class ExceptionDemo with a main method that:
//1.	Attempts to divide an integer by zero and access an array out of bounds.
//2.	Wrap each risky operation in its own try catch:
//o	Catch only the specific exception types: ArithmeticException and ArrayIndexOutOfBoundsException.
//o	In each catch, print a user-friendly message.
//3.	Add a finally block after each try catch that prints "Operation completed.".
//Example structure:
//try {
//    // division or array access
//} catch (ArithmeticException e) {
//    System.out.println("Division by zero is not allowed!");
//} finally {
//    System.out.println("Operation completed.");
//}

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int div = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        } finally {
            System.out.println("Operation completed.");
        }

        try {
            int[] arr = new int[3];
            int val = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } finally {
            System.out.println("Operation completed.");
        }
    }
}
