package ro.siit.session17.mtq;

public class Square extends Shape{
    private Rectangle backingRectangle;

    public Square(double edge){
        this.backingRectangle = new Rectangle(edge, edge);
    }
    @Override
    public double getArea() {
        return this.backingRectangle.getArea();
    }

    @Override
    public double getPerimeter() {
        return this.backingRectangle.getPerimeter();
    }
}
