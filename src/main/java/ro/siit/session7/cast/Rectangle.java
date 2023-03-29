package ro.siit.session7.cast;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("A rectangle was drawn.");
    }

    public void rectangleSpecificMethod(){
        System.out.println("This is rectangle specific");
    }
}
