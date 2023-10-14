import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 4;
        marks[1] = 5;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int ind = sc.nextInt();

        System.out.println("enter array index you want to divide with");
        int number = sc.nextInt();

        try {
            System.out.println("the value is " + marks[number] / ind);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}
