package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape s) {
        shapeList.add(s);
    }

    public double getTotalArea() {
        double total=0;
        for (Shape s : shapeList) {
            total += s.getArea();
        }
        return total;
    }
}
