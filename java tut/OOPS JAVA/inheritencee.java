package OOPS;

/*
 * Syntax for inheriting class in java
 * 
 * derived class name extends base class name
 *                      |
 *                   keyword
 * 
 */

class Square {
    protected float side;

    public void set_side(float s) {
        side = s;
    }

    public void get_area() {
        System.out.println("The area of given square with side " + side + " is " + (side * side));
    }

    public void get_perimeter() {
        System.out.println("The perimeter of given square with side " + side + " is " + 4 * side);
    }

}

class half_square extends Square {
    public float sides = side / 2;

}

public class inheritencee {

}

/*
 * Termilogy in inheritence java
 * parent class/ superclass = base class
 * child class/ sub- class = derived class
 * 
 * java don't support multiple inheritence
 * 
 */
