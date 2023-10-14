
public class method_aka_function {
    static void summ(int a, int b) {
        System.out.println(a + b);
    }

    static class calc {
        public int summm(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        summ(3, 4);
        calc obj;
        obj = new calc();
        int c = obj.summm(3, 40);
        System.out.println(c);

    }
}
