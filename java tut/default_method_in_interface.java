interface cycle {
    int a = 45;

    void applybrakes(int decrement);

    void speedUp(int increment);

    default void blowhorn() { // default methods can be implemented in interface and it is not not necessary
                              // to override this method in the class which is implementing this interface
        System.out.println("piii piii");
    }
}

interface ElectricCycle {
    void batteryCharge(int power);

    void discharge(int consume);
}

class AvonCycle implements cycle, ElectricCycle { // like this you can use as many interfaces to make a class
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

public class default_method_in_interface {
    public static void main(String[] args) {

    }
}
