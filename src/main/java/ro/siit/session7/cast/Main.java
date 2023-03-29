package ro.siit.session7.cast;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.rectangleSpecificMethod();

        Shape rectangleAsShape = rectangle;
        ((Rectangle)rectangleAsShape).rectangleSpecificMethod();
        rectangleAsShape.printColor();

        int i = 2;

        Integer intObj = Integer.valueOf(i);

        int j = intObj/*.intValue()*/;

        System.out.println(i + intObj + j);

    }
}
