// package OOPS;

class phone {

    public void showTime() {
        System.out.println("Current time is 11:40 AM");
    }

    public void on() {
        System.out.println("Turning On phone");
    }
}

class smartphone extends phone {
    @Override
    public void on() {
        System.out.println("Turning On smartphone");
    }

    public void music() {
        System.out.println("Playing music");
    }
}

public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        // phone ph = new phone(); // This means ph is a phone and after = means that
        // this phone | allowed
        // ph.name();
        // smartphone smph = new smartphone(); //allowed

        phone obj = new smartphone(); // if reference is of super class and object is of sub class then it is possible
        // smartphone obbj = new phone(); //This is not allowed
        obj.showTime();
        obj.on(); // if like this we have same methods name in super class and subclass then the
                  // method of object will run not reference | smartphone method will run and this
                  // is called dynamic method dispatch

        // obj.music() // This is will give error because this method is not in
        // superclass so if we do
        // dynamic method dispatch then to run a method it should already have to be in
        // superclass

        // Super - sub is allowed
        // Sub - Super is not allowed

    }
}