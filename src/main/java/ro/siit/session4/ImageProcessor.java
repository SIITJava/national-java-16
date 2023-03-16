package ro.siit.session4;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProcessor {
    public static void main(String[] args) throws IOException {
        BufferedImage srcImage = ImageIO.read(new File("original.png")); // Load image
        // BufferedImage scaledImage = Scalr.resize(srcImage, 150); // Scale image
        BufferedImage rotatedImage = Scalr.rotate(srcImage, Scalr.Rotation.FLIP_VERT);

        File outputFile = new File("flipped.png");
        ImageIO.write(rotatedImage, "png", outputFile);

    }
}
