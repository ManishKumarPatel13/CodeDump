interface cycle {
    void applybrakes(int decrement);

    void speedUp(int increment);
}

class AvonCycle implements cycle { // for interface implements keyword is used instead of extends
    int speed = 8;

    @Override
    public void applybrakes(int decrement) {
        this.speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

}

public class Interfaces_Intro {

}

/*
 * Interfaces is like an abstract class but it has only abstract methods
 * 
 * java interface = A group of related methods with empty bodies
 * 
 * and like abstract class you can not make objects of interface but you can
 * make their references
 * 
 * and you can make class using multiple interfaces but you can not make a class
 * using multiple abstract classes
 */
