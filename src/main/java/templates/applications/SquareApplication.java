package templates.applications;

import models.Square;
import templates.bounce.SquareBounce;
import utils.ShapeRunnable;

import javax.swing.*;
import java.awt.*;

public class SquareApplication extends Application {

    private SquareBounce frame;

    @Override
    protected void start() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new SquareBounce();
                frame.setBounds(locationX, locationY, WINDOW_WIDTH, WINDOW_HEIGHT);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

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
                .setStartPosition(frame.getShapesComponent().getBounds().width, frame.getShapesComponent().getBounds().height)
                .setAngle(130)
                .setStartSpeed(100)
                .setColor(colors[(int)Math.floor(Math.random() * 10)]);

        frame.getShapesComponent().add(rect);
        Runnable r = new ShapeRunnable(rect, frame.getShapesComponent());
        Thread t = new Thread(r) ;
        t.start ();
    }
}
