

public class Introduction {

    public int sum(int n){

        if (n== 0){
            return 0;
        }
        int prevsum = sum(n-1);
        return n + prevsum;
    }

    public static int pow(int n, int p){

        if (p == 0){
            return 1;
        }
        int power = pow(n, p-1);
        return n*power;
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        else if(n == 0){
            return 0;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        // int c = pow(5, 3);
        // System.out.println(c);
        // int f = factorial(5);
        // System.out.println(f);
        // for(int i = 1; i < 6; i++){
        //     System.out.println(fibonacci(i));
        // }
        // System.out.println(fib);
        int[] ar = new int[5];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;
        ar[4] = 5;
        System.out.println(ar[]);



    }
    }
