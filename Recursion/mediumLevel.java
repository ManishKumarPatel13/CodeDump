public class mediumLevel {

    public static boolean checkSort(int[] arr, int n){
        if (arr[n] < arr[n-1]){
            return false;
        }
        else if (n == 1){
            return true;
        }
        return checkSort(arr, n-1);
    }

    public static void dec(int n){
        if(n == 0){
            System.out.print(0);
            return;
        }
        System.out.print(n + " ");
        dec(n-1);
        
    }

    public static void inc(int n){
        if (n == 1){
            System.out.print(1 + " ");
            return;
        }
        inc(n-1);
        System.out.print(n + " ");

    }

    public static int firstapp(int[] arr,int n, int i, int key){
        if (i == n){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstapp(arr, n, i + 1, key);

    }

    public static int lastapp(int[] arr, int n, int key){
        if (n == 0){
            return -1;
        }
        if (arr[n] == key){
            return n;
        }
        return lastapp(arr, n-1, key);
    }

    // public static void reverseStr(String s, int n){
    //     if (n > l)
    // }
    public static void main(String[] args) {
        int[] ar = {2, 3, 4, 5, 9, 4,  7 , 6};
        // boolean b = checkSort(ar, ar.length - 1);
        // System.out.println(b);
        // dec(8);
        // System.out.println();
        // inc(8);
        int d = firstapp(ar, ar.length - 1, 0,  4);
        int l = lastapp(ar, ar.length - 1, 4);
        System.out.println(l);
        System.out.println(d); 
    }
}
