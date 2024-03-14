package Task4;

public class Task4 {
    public static void main(String[] args) {
        ShapeBuilder myShapes = new ShapeBuilder();
        myShapes.addShape(new Square(20));
        myShapes.addShape(new Circle(11.28665));
        System.out.println(myShapes.getTotalArea());
    }
}
