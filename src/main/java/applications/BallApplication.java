package applications;

import models.Ball;
import models.Shape;
import utils.ShapeRunnable;

public class BallApplication extends Application {


    @Override
    protected void addShape() {
        Shape ball = new Ball()
                .setStartPosition(shapesPanel.getBounds().width, shapesPanel.getBounds().height)
                .setAngle(150)
                .setStartSpeed(100);
        shapesPanel.add(ball);
        Runnable r = new ShapeRunnable(ball, shapesPanel);
        Thread t = new Thread(r) ;
        t.start ();
    }
}
