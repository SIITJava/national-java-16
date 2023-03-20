package ro.siit.session5.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    List<Shape> shapes = new ArrayList<>();

    void addShape(Shape shape){
        shapes.add(shape);
    }

    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.addShape(new Shape());
        canvas.addShape(new Square());
        Triangle triangle = new Triangle();
        canvas.addShape(triangle);
        canvas.addShape(new Circle());

        for (Shape shape: canvas.shapes) {
            shape.draw();
            shape.erase();
            shape.getColor();
            // shape.flipHorizontally();
            if(shape instanceof Triangle){
                ((Triangle)shape).flipHorizontally();
            }
        }

        canvas.shapes.remove(triangle);

        System.out.println("__________");

        for (Shape shape: canvas.shapes) {
            shape.draw();
            shape.erase();
            shape.getColor();
            // shape.flipHorizontally();
            if(shape instanceof Triangle){
                ((Triangle)shape).flipHorizontally();
            }
        }
    }
}
