package models;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Shape {

    @Override
    public void drawShape(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.fill(new Rectangle2D.Double(x, y, XSIZE, YSIZE));
    }
}
