package models;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Star extends Shape {

    private int radius;
    private BufferedImage image;

    public Star(int radius) {
        this.radius = radius;
    }

    @Override
    public void drawShape(Graphics g) {
        try {
            image = ImageIO.read(new File("src/main/resources/star.jpeg"));
            g.drawImage(image, (int)x, (int)y, radius, radius, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
