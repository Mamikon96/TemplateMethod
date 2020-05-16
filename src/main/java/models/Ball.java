package models;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ball extends Shape {

    /*private static final int XSIZE = 40;
    private static final int YSIZE = 40;

    private static final double g = 9.81;

    private double x0;
    private double y0;
    private double x;
    private double y;
    private double angle;
    private double v0;
    private double halfPeriod = 0;

    private double dx;
    private double dy;

    private Color color;*/


    /*public models.Ball() {
        x = 0;
        y = 0;
    }

    public models.Ball(double startX, double startY) {
        this();
        x0 = startX;
        y0 = startY;
    }

    public models.Ball(double startX, double startY, double deltaX, double deltaY) {
        x = startX;
        y = startY;
        dx = deltaX;
        dy = deltaY;
    }*/

    /*public models.Ball setStartPosition(double x, double y) {
        this.x0 = x - XSIZE;
        this.y0 = y - YSIZE;
        return this;
    }

    public models.Ball setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    public models.Ball setStartSpeed(double speed) {
        this.v0 = speed;
        return this;
    }

    public models.Ball setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }*/


    /*public void move(Rectangle bounds) {
        x += dx;
        y += dy;
        if (x < bounds.getMinX()){
            x = bounds.getMinX() ;
            dx = -dx;
        }
        if (x + XSIZE >= bounds.getMaxX()){
            x = bounds.getMaxX() - XSIZE;
            dx = -dx;
        }
        if (y < bounds.getMinY()){
            y = bounds.getMinY() ;
            dy = -dy;
        }
        if (y + YSIZE >= bounds.getMaxY()){
            y = bounds.getMaxY() - YSIZE;
            dy = -dy;
        }
    }*/

    /*public void move(double time, Rectangle bounds) {
        if (x < bounds.getMinX()) {
            x = bounds.getMinX() ;
            angle = 180 - angle;
            x0 = bounds.getMinX() - x0;
        }
        if (x + XSIZE > bounds.getMaxX()){
            x = bounds.getMaxX() - XSIZE;
            angle = 180 - angle;
            x0 = 2 * bounds.getMaxX() - x0 - 2 * XSIZE;
        }
        if (y + YSIZE > bounds.getMaxY()){
            y = bounds.getMaxY() - YSIZE;
            x0 = x;
            halfPeriod = time;
        }

        double curTime = time - halfPeriod;
        dx = v0 * curTime * Math.cos(Math.toRadians(angle));
        dy = - v0 * curTime * Math.sin(Math.toRadians(angle)) + (g * curTime * curTime) / 2;

        x = x0 + dx;
        y = y0 + dy;
    }*/

    /*
     *Получает форму мяча в текущей позиций.
     */

    /*public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
    }*/


    @Override
    public void drawShape(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, XSIZE, YSIZE));
    }
}