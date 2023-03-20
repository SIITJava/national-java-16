package ro.siit.session5.shapes;

public class Triangle extends Shape{
    public void flipHorizontally(){
        System.out.println("Flipping horizontally " + this.getClass().getName());
    }

    public void flipVertically(){
        System.out.println("Flipping vertically " + this.getClass().getName());
    }

    @Override
    public void draw() {
        System.out.println("I am really drawing a " + this.getClass().getName());
    }
}
