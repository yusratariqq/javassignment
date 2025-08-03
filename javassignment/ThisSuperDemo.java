class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    String brand;

    public Car(String type, String brand) {
        super(type);
        this.brand = brand;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Car brand: " + this.brand);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Toyota");
        myCar.display();
    }
}
