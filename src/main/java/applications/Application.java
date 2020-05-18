package applications;

import utils.ShapesPanel;

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

    protected JPanel buttonPanel;
    protected ShapesPanel shapesPanel;

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
    private void initApplication() {
        initBounds();
        initListeners();
        initButtonsPanel();
        initShapesPanel();
    }

    private void start() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                add(shapesPanel, BorderLayout.CENTER);
                add(buttonPanel, BorderLayout.SOUTH);
                show();
            }
        });
    }

    private void end() {
        System.exit(0);
    }

    protected abstract void addShape();





    private void initListeners() {
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

    private void addButton (Container container, String title, ActionListener listener){
        JButton button = new JButton(title);
        container.add(button);
        button.addActionListener(listener);
    }

    private void initBounds() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        locationX = (screenSize.width - WINDOW_WIDTH) / 2;
        locationY = (screenSize.height - WINDOW_HEIGHT) / 2;

        setResizable(false);
        setBounds(locationX, locationY, WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initButtonsPanel() {
        buttonPanel = new JPanel();
        addButton(buttonPanel, "Пуск", addShapeListener);
        addButton(buttonPanel, "Закрыть", endListener);
    }

    private void initShapesPanel() {
        shapesPanel = new ShapesPanel();
    }
}
