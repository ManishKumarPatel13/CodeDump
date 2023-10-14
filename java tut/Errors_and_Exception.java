import java.util.Scanner;

public class Errors_and_Exception {
    public static void main(String[] args) {
        // Syntax Error Demo
        // int a = 9 // this will give syntax error because the semi-colon is missing at
        // the end
        int b = 8;

        // Logical error Demo
        // write a program to print all prime numbers from 1 to 10
        System.out.println(2);
        for (int i = 1; i < 6; i++) {
            System.out.println(2 * i + 1);
        }

        // Runtime error demo
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println(1000 / k); // if we give any input rather then int it will give runtime error

    }
}
