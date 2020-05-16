package models;

import java.awt.*;

public abstract class Shape {

    protected static  int XSIZE = 40;
    protected static  int YSIZE = 40;

    protected static final double g = 9.81;

    protected double x0;
    protected double y0;
    protected double x;
    protected double y;
    protected double angle;
    protected double v0;
    protected double halfPeriod = 0;

    protected double dx;
    protected double dy;

    protected Color color;

    public Shape setStartPosition(double x, double y) {
        this.x0 = x - XSIZE;
        this.y0 = y - YSIZE;
        return this;
    }

    public Shape setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    public Shape setStartSpeed(double speed) {
        this.v0 = speed;
        return this;
    }

    public Shape setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public void move(double time, Rectangle bounds) {
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
    }

    public abstract void drawShape(Graphics g);
}
