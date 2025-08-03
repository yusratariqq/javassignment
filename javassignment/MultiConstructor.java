public class MultiConstructor {
    String name;
    int age;

    public MultiConstructor() {
        name = "Unknown";
        age = 0;
    }

    public MultiConstructor(String n) {
        name = n;
        age = 0;
    }

    public MultiConstructor(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        MultiConstructor obj1 = new MultiConstructor();
        MultiConstructor obj2 = new MultiConstructor("Alice");
        MultiConstructor obj3 = new MultiConstructor("Bob", 25);
    }
}
