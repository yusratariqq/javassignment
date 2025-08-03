abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class ShapeSystem {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        rect.display();
        System.out.println("Area: " + rect.area());
    }
}
