import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        String str = sc.nextLine();
        // switch (a) {
        // case 2:
        // System.out.println(2);
        // break;

        // case 4:
        // System.out.println(4);
        // break;

        // default:
        // System.out.println(a);
        // }

        // Unlike cpp you can switch strings in java
        switch (str) {
            case "manish" -> System.out.println("he is a good guy");
            case "vicky" -> {
                System.out.println("you are a good person");
                System.out.println("You need to start exercising");
            }
            default -> System.out.println("live the life");
        }

        sc.close();
    }
}
