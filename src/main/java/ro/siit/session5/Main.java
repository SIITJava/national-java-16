package ro.siit.session5;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2.3);
        rectangle.setLength(4.1);
        System.out.println(rectangle.getArea());

        Square square = new Square();
        square.setWidth(2.2); // doesn't make sense
        square.setLength(2.2);

        square.setEdge(2.2);
        System.out.println(square.getArea());

        SquareEnhancend square1 = new SquareEnhancend();
        square1.setEdge(2.2);
        System.out.println(square1.getArea());
    }
}
