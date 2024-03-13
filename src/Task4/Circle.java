package Task4;

public class Circle implements Shape{
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
}
