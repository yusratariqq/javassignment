final class MyCircle {  // Changed class name
    final double PI = 3.14159;
    final double radius;

    public MyCircle(double r) {
        radius = r;
    }

    public double area() {  // Removed redundant 'final'
        return PI * radius * radius;
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        MyCircle c = new MyCircle(5.0);
        System.out.println("Area: " + c.area());
    }
}
