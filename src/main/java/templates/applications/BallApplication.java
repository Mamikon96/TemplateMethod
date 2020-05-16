package templates.applications;

import models.Ball;
import models.Shape;
import templates.bounce.BallBounce;
import utils.ShapeRunnable;

import javax.swing.*;
import java.awt.*;

public class BallApplication extends Application {

    private BallBounce frame;

    @Override
    protected void start() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
//                JFrame frame = new BallBounceFrame();
//                JFrame frame = new BallBounce();
                frame = new BallBounce();
//                initBallApplication();
//                initListeners();
//                initBounce();
                frame.setBounds(locationX, locationY, WINDOW_WIDTH, WINDOW_HEIGHT);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    @Override
    protected void addShape() {
        Shape ball = new Ball()
                .setStartPosition(frame.getShapesComponent().getBounds().width, frame.getShapesComponent().getBounds().height)
                .setAngle(150)
                .setStartSpeed(100);
        frame.getShapesComponent().add(ball);
        Runnable r = new ShapeRunnable(ball, frame.getShapesComponent());
        Thread t = new Thread(r) ;
        t.start ();
    }
}
