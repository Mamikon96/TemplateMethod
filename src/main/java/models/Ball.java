package models;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ball extends Shape {

    @Override
    public void drawShape(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, XSIZE, YSIZE));
    }
}