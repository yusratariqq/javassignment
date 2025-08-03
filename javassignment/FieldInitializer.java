public class FieldInitializer {
    String brand;
    String model;

    public FieldInitializer(String b, String m) {
        brand = b;
        model = m;
    }

    public static void main(String[] args) {
        FieldInitializer car = new FieldInitializer("Toyota", "Camry");
    }
}
