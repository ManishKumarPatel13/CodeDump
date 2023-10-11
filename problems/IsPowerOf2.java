import java.lang.Math;
public class IsPowerOf2 {
    public static boolean isPowerOfTwo(int n){
        for (int i = 0; i <= 30; i++){ // We have taken 30 because the maximum value of an integer is 2**31 - 1 so if it is greater then that it is invalid
            if(Math.pow(2, i) == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4096));
    }
}
