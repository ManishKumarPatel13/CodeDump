import java.util.Scanner; // Scanner is a classs having different methods

public class getting_user_input_4 {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        // Scanner sc = new Scanner(System.in); // Here we are making a new object of
        // scanner class;
        Scanner sc;
        sc = new Scanner(System.in);

        // System.out.println("Enter first number");
        // // int a = sc.nextInt(); // This takes a integer as input
        // int a = sc.nextInt(); // This takes a float as input
        // boolean b1 = sc.hasNextFloat(); // This will return true if the next input we
        // give is a float
        // System.out.println(b1);
        // System.out.println("Enter second number");
        // // int b = sc.nextInt();
        // float b = sc.nextFloat();
        // float sum = a+b;
        // System.out.println("Sum of two numbers is: "+sum);

        // String str = sc.next(); // This only takes a word as input so the sentence
        // after first space will not get inside it
        String str = sc.nextLine(); // This will take a whole sentence as input
        System.out.println(str);

        sc.close();
    }

}
