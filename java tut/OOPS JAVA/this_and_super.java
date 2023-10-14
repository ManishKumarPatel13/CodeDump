// class get_x {
//     int x;

//     public int getX() {
//         return x;
//     }

//     get_x(int x) {
//         // x = x; // This will not assign the value because of same variable name so compiler will be confused between parameter x and class argument x
//         this.x = x; // So we use this keyword this will now assign the value to the x of class. this is a reference variable which refers any argument or method in a class 

//     }

// }

class EkClass {
    int a;

    EkClass(int v) {
        a = v;
    }

    public int returnone() {
        return 1;
    }

    public int getA() {
        return a;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c); // it is used to refer any parent class variable or method
        System.out.println("do class constructor");
    }
}

public class this_and_super {
    public static void main(String[] args) {
        // get_x x = new get_x(89);
        // System.out.println(x.getX());

        // super-keyword
        EkClass e = new EkClass(5);
        System.out.println(e.getA());
        DoClass d = new DoClass(43);
        System.out.println(d.getA()); // This will set the value of a for doclass as 43

    }
}
