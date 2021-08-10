package exceptionhandlingproblems;
import java.util.Scanner;
class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String s) {
        System.out.println("Value cannot be negative");
        System.out.println(s);
    }
}

public class exception2 {

    public static void main(String[] args) throws MyException {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        try {
            try {
                if (i < 0) {
                    throw new MyException("Please enter a non negative number");
                } else if (i <= 0 | i >= 25) {
                    throw new MyException("Please enter a value between 0 and 25");
                }
            } catch (MyException e) {
                System.out.println("My Exception was thrown and handled: " + e);
                throw new MyException();
            }
        } catch (Exception e) {
            System.out.println("Exception was thrown and handled: ");
        } finally {
            System.out.println("Continuation of uninterupted program");
        }
        System.out.println("Program continues smoothly");
    }
}
