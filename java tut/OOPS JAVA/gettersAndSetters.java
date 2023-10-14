package OOPS;

class Square {
    private float side;

    public void set_side(float s) {
        side = s;
    }

    public void get_area() { // setter
        System.out.println("The area of given square with side " + side + " is " + (side * side));
    }

    public void get_perimeter() { // Getter
        System.out.println("The perimeter of given square with side " + side + " is " + 4 * side);
    }
}

public class gettersAndSetters {

}
