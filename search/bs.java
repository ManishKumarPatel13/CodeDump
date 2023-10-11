public class bs{

public static int bss(int[] arr, int k){
    int mid = arr.length/2;
    int s = 0, e = arr.length;
    while(true){
        if(arr[mid] == k){
            return mid;
        }
        else if(arr[mid] < k){
            s = mid;
            mid = (s+e)/2;
        }
        else{
            e = mid - 1;
            mid = (s+e)/2;
        }
    }
}
public static void main(String[] args){
    int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int c;
    c = bss(ar, 3);
    System.out.println(c);
    }
}