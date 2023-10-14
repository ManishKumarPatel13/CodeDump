import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() { // this gets executed when e is printed
        return "I am to string()";
    }

    @Override
    public String getMessage() {
        return "I am getmessage()"; // this is the exception message
    }
}

public class Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 9) {
            try {
                throw new ArithmeticException("This is an exception");
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();

            }
        }
    }
}
