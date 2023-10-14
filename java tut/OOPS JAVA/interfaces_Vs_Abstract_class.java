// package OOPS;

interface cycle {
    int a = 45;

    void applybrakes(int decrement);

    void speedUp(int increment);
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

public class interfaces_Vs_Abstract_class {
    public static void main(String[] args) {
        AvonCycle aa = new AvonCycle();
        System.out.println(aa.a); // You can use the arguments present in interfaces
        // aa.a = 89;
        // System.out.println(aa.a); // but you can't change the value of a interface
        // argument because they are declared final
    }
}
