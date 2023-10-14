import java.util.Scanner;

public class _3D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3d array size:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[][][] mat3 = new int[a][b][c];

        // Taking input

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.println("Enter element:");
                    int ele = sc.nextInt();
                    mat3[i][j][k] = ele;
                }
            }
        }

        // printing Elements
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(mat3[i][j][k] + " ");
                }
                System.out.println();
            }
            // System.out.println();
        }
        sc.close();
    }
}
