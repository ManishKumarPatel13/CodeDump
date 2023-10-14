// package OOPS;

class base {
    protected int size;

    base() {
        System.out.println("default constructor is called");
    }

    base(int a) { // to use this constructor in derived class we have to use a keyword called
                  // super
        size = a;
        System.out.println("overloaded constructor is called");
        System.out.println("The value of size is " + size);
    }

}

class derived extends base {

    derived() {
        System.out.println("der1 constructor called");
    }

    derived(int a) {
        super(a); // this will call the base class constructor with parameters
        System.out.println("der1 overloaded constructor called");
    }
}

class childDerived extends derived {
    childDerived() {
        System.out.println("child derived constructor called");
    }

    childDerived(int a) {
        super(a);
        System.out.println("overloaded constructor of child derived is called");
    }
}

public class constructor_inheritence {
    public static void main(String[] args) {
        // base b = new base();
        // derived d = new derived();
        derived dd = new derived(4);
        // childDerived cd = new childDerived();
        childDerived cdd = new childDerived(3);

    }
}

/*
 * first the constructor of base class is called then the derived class then
 * child derived
 * 
 * to use the parameterized constructor of a base class from a derived class we
 * have to use super keyword
 */