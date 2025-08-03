class Smartphone {
    String brand;
    String model;
    double price;

    // Default constructor
    public Smartphone() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
    }

    // Fully parameterized constructor
    public Smartphone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy constructor
    public Smartphone(Smartphone other) {
        this.brand = other.brand;
        this.model = other.model;
        this.price = other.price;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone();
        Smartphone phone2 = new Smartphone("Apple", "iPhone 15");
        Smartphone phone3 = new Smartphone("Samsung", "Galaxy S24", 999.99);
        Smartphone phone4 = new Smartphone(phone3);

        phone1.display();
        phone2.display();
        phone3.display();
        phone4.display();
    }
}
