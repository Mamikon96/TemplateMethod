package templates.applications;

import utils.ShapesComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Application extends JFrame {

    protected static final int WINDOW_WIDTH = 1200;
    protected static final int WINDOW_HEIGHT = 600;
    protected int locationX;
    protected int locationY;

    protected ActionListener addShapeListener;
    protected ActionListener endListener;

    protected ShapesComponent shapesComponent;
    protected JPanel buttonPanel;

    protected static volatile boolean isRun = false;
    protected static volatile boolean isAddButtonClicked = false;



    // Start App
    public final void run() {
        initApplication();
        start();
        isRun = true;
        while (isRun) {
            if (isAddButtonClicked) {
                addShape();
                isAddButtonClicked = false;
            }
        }
        end();
    }


    /*
    *   Steps
    * */
    protected void start() {}
    protected abstract void addShape();

    private void end() {
        System.exit(0);
    }



    protected void initApplication() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        locationX = (screenSize.width - WINDOW_WIDTH) / 2;
        locationY = (screenSize.height - WINDOW_HEIGHT) / 2;
    }

    protected void initListeners() {
        addShapeListener = new ActionListener(){
            public void actionPerformed(ActionEvent event){
                isAddButtonClicked = true;
            }
        };
        endListener = new ActionListener() {
            public void actionPerformed(ActionEvent event){
                isRun = false;
            }
        };
    }

    protected void initBounce() {
        setTitle("Template Method");
        shapesComponent = new ShapesComponent();
        shapesComponent.setBackground(Color.cyan);
        add(shapesComponent, BorderLayout.CENTER);
        buttonPanel = new JPanel();

        addButton(buttonPanel, "Пуск", addShapeListener);
        addButton(buttonPanel, "Закрыть", endListener);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    protected void addButton (Container container, String title, ActionListener listener){
        JButton button = new JButton(title);
        container.add(button);
        button.addActionListener(listener);
    }

    public ShapesComponent getShapesComponent() {
        return shapesComponent;
    }
}
