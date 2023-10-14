public class finally_block {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally the value of b " + b); // this is going to run no matter what
            }
            b--;
        }
    }
}

/*
 * finally is a block which will run whether the exception is handled or not it
 * is used to close open files and other resources
 */
