public class ObjectCloner {
    String item;
    double price;

    public ObjectCloner(String i, double p) {
        item = i;
        price = p;
    }

    public ObjectCloner(ObjectCloner other) {
        item = other.item;
        price = other.price;
    }

    public static void main(String[] args) {
        ObjectCloner original = new ObjectCloner("Laptop", 999.99);
        ObjectCloner copy = new ObjectCloner(original);
    }
}
