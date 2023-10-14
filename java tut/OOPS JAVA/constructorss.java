package OOPS;

class Square {
    private float side;

    // public void set_side(float s) {
    // side = s;
    // }

    Square(float s) { // This is a constructor
        side = s;
    }

    public void get_area() {
        System.out.println("The area of given square with side " + side + " is " + (side * side));
    }

    public void get_perimeter() {
        System.out.println("The perimeter of given square with side " + side + " is " + 4 * side);
    }
}

public class constructorss {

}
