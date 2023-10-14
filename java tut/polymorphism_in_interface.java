interface cycle2 {
    int a = 45;

    void applybrakes(int decrement);

    void speedUp(int increment);
}

interface ElectricCycle2 {
    void batteryCharge(int power);

    void discharge(int consume);
}

class AvonCycle2 implements cycle2, ElectricCycle2 { // like this you can use as many interfaces to make a class
    int speed = 8;
    int battery = 10;

    @Override
    public void applybrakes(int decrement) {
        this.speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public void batteryCharge(int power) {
        this.battery += power;
    }

    @Override
    public void discharge(int consume) {
        this.battery -= consume;
    }

}

public class polymorphism_in_interface {
    public static void main(String[] args) {
        cycle2 objj = new AvonCycle2(); // here I can only use cycle and avon cycle methods not electriccycle methods
        objj.applybrakes(0);
        // objj.discharge(); // not allowed
        AvonCycle2 objjj = new AvonCycle2(); // I can use all methods in this 
    }
}
