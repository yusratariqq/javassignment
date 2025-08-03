public class MethodTypeDemo {
    static void staticShow() {
        System.out.println("Static method - No object needed");
    }

    void instanceShow() {
        System.out.println("Instance method - Requires object");
    }

    public static void main(String[] args) {
        staticShow();
        MethodTypeDemo obj = new MethodTypeDemo();
        obj.instanceShow();
    }
}
