class BaseVehicle {
    void startEngine() {
        System.out.println("Engine started");
    }
}

class Automobile extends BaseVehicle {
    void increaseSpeed() {
        System.out.println("Speed increasing");
    }
}

class ElectricVehicle extends Automobile {
    void chargeBattery() {
        System.out.println("Battery charging");
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle();
        ev.startEngine();
        ev.increaseSpeed();
        ev.chargeBattery();
    }
}
