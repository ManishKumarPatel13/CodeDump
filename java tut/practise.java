// import java.util.Scanner;
// import java.util.Random;

public class practise {
    public static void interChange(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // // pattern

        // int n = sc.nextInt();
        // for (int i = 0; i < +n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Random r = new Random();
        // int a = r.nextInt(3);
        // System.out.println(a);

        // sc.close();
        int a = 43;
        int b = 87;

        System.out.println(a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        interChange(a, b);
        System.out.println(a);
    }
}
