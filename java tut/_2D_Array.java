import java.util.Scanner;

public class _2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // it's the same 2d array as in cpp
        int[][] mat = new int[a][b];

        // Taking Input

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Enter Element:");
                int ele = sc.nextInt();
                mat[i][j] = ele;
            }
        }

        // printing 2d array elements
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
