package ro.siit.session17.mtq;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanvasTestsSuite {
    @Test
    public void add_multiple_similar_shapes_does_not_work(){
        Canvas canvas = new Canvas();

        canvas.addShape(new Square(2));
        canvas.addShape(new Square(3));

        Assertions.assertEquals(4, canvas.getTotalArea());
    }
}
