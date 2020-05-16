package utils;

import models.Shape;

public class ShapeRunnable implements Runnable {

    private Shape shape;
    private ShapesComponent component;
    public static final int STEPS = 1000;
    public static int DELAY = 1;


    public ShapeRunnable(ShapesComponent component) {
        this.component = component;
    }

    public ShapeRunnable(Shape shape, ShapesComponent component) {
        this.shape = shape;
        this.component = component;
    }

    public void run() {
        try {
            double time = 0;
            /*for (int i = 1; i <= STEPS; i++)*/while (true) {
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

    /*public void run() {
        try {
            double time = 0;
            *//*for (int i = 1; i <= STEPS; i++)*//*while (true) {
                component.getShape().move((time)/100, component.getBounds());
                component.repaint();
                time += DELAY;
                Thread.sleep(DELAY);
//                Thread.sleep(0, 10);
            }
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }*/
}