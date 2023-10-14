package DatatypeOfExpressionsAndIncrement;

public class DecrementOperators {

    public static void main(String[] args) {
        int s = 5;
        byte b = 3;
        int ss = s + b;
        System.out.println(ss);
        char c = 'c';
        System.out.println(c); // This will print c
        c++; // this will change c to its next letter which is d
        System.out.println(c); // This will print d

    }

}

/*
 * Resulting datatypes after arithmetic operation
 * 
 * byte = b, short = s, long = l, float = f, int = i, double = d, char = c,
 * 
 * b+s = int; , s+i = int, l+f = float, i +f = float;, c+i = int;, c+s = int,
 * l+d = double, s +double = double;, f+d = double
 * 
 * 
 * 
 */
