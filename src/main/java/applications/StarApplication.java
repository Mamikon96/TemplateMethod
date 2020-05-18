package applications;

import models.Star;
import utils.ShapeRunnable;

public class StarApplication extends Application {

    @Override
    protected void addShape() {
        models.Shape star = new Star(40)
                .setStartPosition(shapesPanel.getBounds().width, shapesPanel.getBounds().height)
                .setAngle(110)
                .setStartSpeed(100);
        shapesPanel.add(star);
        Runnable r = new ShapeRunnable(star, shapesPanel);
        Thread t = new Thread(r) ;
        t.start ();
    }
}
