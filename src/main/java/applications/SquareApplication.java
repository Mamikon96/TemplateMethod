package applications;

import models.Square;
import utils.ShapeRunnable;

import java.awt.*;

public class SquareApplication extends Application {

    @Override
    protected void addShape() {
        Color[] colors = new Color[] {
                Color.RED,
                Color.GREEN,
                Color.BLUE,
                Color.RED,
                Color.GREEN,
                Color.BLUE,
                Color.RED,
                Color.GREEN,
                Color.BLUE,
                Color.RED
        };

        models.Shape rect = new Square()
                .setStartPosition(shapesPanel.getBounds().width, shapesPanel.getBounds().height)
                .setAngle(130)
                .setStartSpeed(100)
                .setColor(colors[(int)Math.floor(Math.random() * 10)]);

        shapesPanel.add(rect);
        Runnable r = new ShapeRunnable(rect, shapesPanel);
        Thread t = new Thread(r) ;
        t.start ();
    }
}
