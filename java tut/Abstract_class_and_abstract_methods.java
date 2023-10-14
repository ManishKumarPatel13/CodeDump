abstract class Parent2 {
    public Parent2() {
        System.out.println("mai base 2 ka constructor hu");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet(); // This means the class which will inherit this can enter anything they want in
                                  // greet

}

class child2 extends Parent2 {
    @Override
    public void greet() { // methods defined abstract in parent class must be present in child classes or
                          // child class should be made abstract
        System.out.println("Good morning!");
    }
}

abstract class child3 extends Parent2 {
    public void th() {
        System.out.println("Hey!!");
    }
}

public class Abstract_class_and_abstract_methods {
    public static void main(String[] args) {
        // Parent2 obj = new Parent2() {
        // @Override
        // public void greet() {
        // System.out.println("hello");
        // }
        // }; // LIke this we can make an obj of abstract class by using it's abstract
        // method

        // parent2 obj = new Parent2(); // This will give an error

        child2 obj = new child2();

        // child3 objj = new child3(); // This will also show error

    }
}

/*
 * abstract method = a method that is declared without an implementation like -
 * abstract void moveTo(int x, int y);
 * 
 * abstract class = If a class includes abstract methods, then the class itself
 * must be declared abstract, as in
 * 
 * public abstract class PhoneModel{
 * abstract void switchoff();
 * 
 * }
 * 
 * If there is one abstract method in a class then the class will be a abstract
 * class And You can't make objects of abstract class
 * 
 */
