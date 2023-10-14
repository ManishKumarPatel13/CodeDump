class NegativeRadiusException extends Exception {
    @Override
    public String toString() { // this gets executed when e is printed
        return "Area can never be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negative"; // this is the exception message
    }
}

public class throw_and_throws {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException(); // this will call the class and throw exception
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException { // this tells that this method could throw this
                                                                        // exception so use it with try catch
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // try {
        // int c = divide(6, 0);
        // System.out.println(c);
        // } catch (Exception e) {
        // System.out.println("Exception");
        // }

        try {
            double ar = area(6); // this will now say that you have to use try catch to run this
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
