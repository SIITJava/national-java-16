package ro.siit.session5.shapes;

import java.awt.Color;

public class Shape {
    private Color color;
    public void draw(){
        System.out.println("Drawing " + this.getClass().getName());
    }

    public void erase(){
        System.out.println("Erasing " + this.getClass().getName());
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        System.out.println("Calling getColor on " + this.getClass().getName());
        return color;
    }
}
