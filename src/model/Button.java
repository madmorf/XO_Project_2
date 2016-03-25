package model;


import controller.GameKernell;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {
    private Point coordinatePoint;

    public Button(Point coordinatePoint, GameKernell gameGameKernell) {
        this.coordinatePoint = coordinatePoint;
        setIcon(new ImageIcon("/home/alex/dev/ide/IntellijIdea/XO_Project/resources/empty.png"));
        setText(coordinatePoint.toString());
        setBorder(BorderFactory.createLoweredSoftBevelBorder());
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            gameGameKernell.setFigureToTheField(getCoordinatePoint(), gameGameKernell.getNextPlayer());

            }
        });
    }


    public Point getCoordinatePoint() {
        return coordinatePoint;
    }
}
