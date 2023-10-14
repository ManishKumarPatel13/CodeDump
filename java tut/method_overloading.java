public class method_overloading {

    static void summ(int a, int b) {
        System.out.println(a + b);
    }

    static void summ(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        summ(4, 5);
        summ(3, 5, 2); // function with same name but different parameters can be made and this is
                       // called function overloading
    }
}
