package templates.applications;

import models.Star;
import templates.bounce.StarBounce;
import utils.ShapeRunnable;

import javax.swing.*;
import java.awt.*;

public class StarApplication extends Application {

    private StarBounce frame;

    @Override
    protected void start() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new StarBounce();
                frame.setBounds(locationX, locationY, WINDOW_WIDTH, WINDOW_HEIGHT);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    @Override
    protected void addShape() {
        models.Shape star = new Star(40)
                .setStartPosition(frame.getShapesComponent().getBounds().width, frame.getShapesComponent().getBounds().height)
                .setAngle(110)
                .setStartSpeed(100);
        frame.getShapesComponent().add(star);
        Runnable r = new ShapeRunnable(star, frame.getShapesComponent());
        Thread t = new Thread(r) ;
        t.start ();
    }
}
