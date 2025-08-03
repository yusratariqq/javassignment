abstract class GeometricForm {
    abstract double calculateSurface();

    void showDescription() {
        System.out.println("This is a geometric form");
    }
}

class RectangularForm extends GeometricForm {
    double length;
    double width;

    RectangularForm(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    double calculateSurface() {
        return length * width;
    }
}

class CircularForm extends GeometricForm {
    double radius;

    CircularForm(double r) {
        radius = r;
    }

    @Override
    double calculateSurface() {
        return Math.PI * radius * radius;
    }
}

public class GeometrySystem {
    public static void main(String[] args) {
        GeometricForm rectangle = new RectangularForm(5, 4);
        GeometricForm circle = new CircularForm(3);

        rectangle.showDescription();
        System.out.println("Rectangle area: " + rectangle.calculateSurface());

        circle.showDescription();
        System.out.println("Circle area: " + circle.calculateSurface());
    }
}
