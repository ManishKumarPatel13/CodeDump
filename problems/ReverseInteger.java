import java.lang.Math;

public class ReverseInteger {

    public static long reverseInteger(long n){
        String s = String.valueOf(n);
        int l = s.length();
        for (int i = l - 1; i >= 0; i--){
            s += s.charAt(i);
        }
        s = s.substring(l);
        n = Integer.parseInt(s);
        if (n < Integer.MIN_VALUE/10 || n > Integer.MAX_VALUE/10){
            return 0;
        }
        return n;
    }
    public static void main(String[] args){
        System.out.println(reverseInteger(99999999));
    }
}
