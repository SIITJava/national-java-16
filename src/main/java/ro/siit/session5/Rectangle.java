package ro.siit.session5;

public class Rectangle {
    private double length, width;

    double getArea(){
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
