package ro.siit.session17.mtq;

import java.util.HashSet;
import java.util.Set;

public class Canvas {
    private Set<Shape> shapeSet = new HashSet<>();

    public void addShape(Shape shape){
        if (shapeSet.contains(shape)){
            System.out.println("Cannot add duplicate shape");
        } else {
            this.shapeSet.add(shape);
        }
    }

    public double getTotalArea(){
        double area = 0.0;
        for (Shape shape: shapeSet) {
            area += shape.getArea();
        }

        return area;
    }

    public double getTotalPerimeter(){
        double perimeter = 0.0;
        for (Shape shape: shapeSet) {
            perimeter += shape.getPerimeter();
        }

        return perimeter;
    }
}
