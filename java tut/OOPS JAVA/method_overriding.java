class A {
    public void meth1() {
        System.out.println("I am method 1 of class A");
    }

}

class B extends A {
    // there is no method so class A method will run

    // but if we make a method of same name we have to use override also to identify
    // we are overriding a method of super
    @Override
    public void meth1() {
        System.out.println("I am method 1 of class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();

    }
}
