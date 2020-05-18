package utils;

import models.Shape;

public class ShapeRunnable implements Runnable {

    private Shape shape;
    private ShapesPanel component;
    public static final int STEPS = 1000;
    public static int DELAY = 1;


    public ShapeRunnable(ShapesPanel component) {
        this.component = component;
    }

    public ShapeRunnable(Shape shape, ShapesPanel component) {
        this.shape = shape;
        this.component = component;
    }

    public void run() {
        try {
            double time = 0;
            while (true) {
                shape.move((time)/100, component.getBounds());
                component.repaint();
                time += DELAY;
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}