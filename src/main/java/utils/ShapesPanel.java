package utils;

import models.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapesPanel extends JPanel {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapesPanel() {
        super();
        setBackground(Color.cyan);
    }

    public void add(models.Shape shape){
        shapes.add(shape);
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        for (models.Shape shape : shapes) {
            shape.drawShape(g);
        }
    }
}