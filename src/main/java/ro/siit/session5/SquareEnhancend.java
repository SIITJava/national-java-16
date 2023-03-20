package ro.siit.session5;

public class SquareEnhancend {
    private double edge;
    private Rectangle squareSeenAsRectangle = new Rectangle();

    double getArea(){
        return squareSeenAsRectangle.getArea();
    }

    void setEdge(double edge){
        this.edge = edge;
        this.squareSeenAsRectangle.setWidth(edge);
        this.squareSeenAsRectangle.setLength(edge);
    }
}
